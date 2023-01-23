package by.mycourseproject.back.authconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final AuthenticationService authenticationService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf().disable().cors().disable()
                .headers().frameOptions().sameOrigin().and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/h2admin/**").permitAll()
                .antMatchers("/car/addCar").hasRole("ADMIN")
                .antMatchers("/car/deleteCar").hasRole("ADMIN")
                .antMatchers("/car/viewCars").hasAnyRole("ADMIN", "USER")
                .antMatchers("/user/addUser").hasRole("ADMIN")
                .antMatchers("/user/deleteUser").hasRole("ADMIN")
                .antMatchers("/user/vieUsers").hasRole("ADMIN")
                .antMatchers("/order/addOrder").hasAnyRole("ADMIN", "USER")
                .antMatchers("/order/deleteOrder").hasRole("ADMIN")
                .antMatchers("/order/viewOrders").hasRole("ADMIN")
                .antMatchers("/payment/addPayment").hasRole("ADMIN")
                .antMatchers("/payment/deletePayment").hasRole("ADMIN")
                .antMatchers("/payment/viewPayments").hasAnyRole("ADMIN", "USER")
                .and()
                .formLogin();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authenticationService);
    }


}