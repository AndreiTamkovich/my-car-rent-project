package by.mycourseproject.back.configuration;

import by.mycourseproject.back.repository.UserRepository;
import by.mycourseproject.back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthenticationService implements UserDetailsService {

    private final UserService userService;

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Call: loadUserByUsername");
        try {
           by.mycourseproject.back.entity.User appUsers = userRepository.getUserByLogin(username);
            if (appUsers == null) {
                throw new UsernameNotFoundException("User not found: " + username);
            }

            return new User(
                    appUsers.getLogin(),
                    "{noop}" + appUsers.getPassword(),
                    true,
                    true,
                    true,
                    true,
                    List.of(new SimpleGrantedAuthority("ROLE_" + appUsers.getRole()))
            );

        } catch (Exception e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("User not found: " + username, e);
        }
    }
}