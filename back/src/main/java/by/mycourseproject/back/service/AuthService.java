package by.mycourseproject.back.service;

import by.mycourseproject.back.dto.UserDto;
import by.mycourseproject.back.entity.User;
import by.mycourseproject.back.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    public boolean loginValidation(UserDto dto) {

        User userByLogin = userRepository.getUserByLogin(dto.getLogin());
        if (userByLogin != null) {
            if (userByLogin.getPassword().equals(dto.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
