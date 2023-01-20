package by.mycourseproject.back.repository;

import by.mycourseproject.back.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findAll();

    @Override
    void deleteById(Long id);

    User getUserByLogin(String login);
}
