package by.mycourseproject.mycarrentproject.service;

import by.mycourseproject.mycarrentproject.dto.UserDto;
import by.mycourseproject.mycarrentproject.entity.User;
import by.mycourseproject.mycarrentproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void addUser(@RequestBody UserDto userDto) {
        User newUser = new User();
        newUser.setLogin(userDto.getLogin());
        newUser.setPassword(userDto.getPassword());
        newUser.setEmail(userDto.getEmail());
        newUser.setRole(userDto.getRole());
        userRepository.save(newUser);
    }

    public void deleteUder(@RequestBody Long id) {
        userRepository.deleteById(id);
    }

    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }


}
