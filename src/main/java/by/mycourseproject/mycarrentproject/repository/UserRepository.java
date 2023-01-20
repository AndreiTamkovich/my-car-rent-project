package by.mycourseproject.mycarrentproject.repository;

import by.mycourseproject.mycarrentproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findAll();

    @Override
    void deleteById(Long id);
}
