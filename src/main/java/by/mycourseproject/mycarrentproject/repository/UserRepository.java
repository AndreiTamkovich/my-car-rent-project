package by.mycourseproject.mycarrentproject.repository;

import by.mycourseproject.mycarrentproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
