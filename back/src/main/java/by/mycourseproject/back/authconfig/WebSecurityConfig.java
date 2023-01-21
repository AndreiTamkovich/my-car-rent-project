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
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/add-a-car").hasRole("ADMIN")
                .antMatchers("/delete-a-car").hasRole("ADMIN")
                .antMatchers("/view-cars").hasAnyRole("ADMIN","USER")
                .antMatchers("/add-a-user").hasRole("ADMIN")
                .antMatchers("/delete-a-user").hasRole("ADMIN")
                .antMatchers("/view-users").hasRole("ADMIN")
                .antMatchers("/add-a-order").hasAnyRole("ADMIN","USER")
                .antMatchers("/delete-a-order").hasRole("ADMIN")
                .antMatchers("/view-orders").hasRole("ADMIN")
                .antMatchers("/add-a-payment").hasRole("ADMIN")
                .antMatchers("/delete-a-payment").hasRole("ADMIN")
                .antMatchers("/view-payments").hasAnyRole("ADMIN","USER")
                .and()
                .csrf().disable()
                .formLogin();
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authenticationService);
    }

}