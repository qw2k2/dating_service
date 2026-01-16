package ru.example.dating_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.dating_service.model.User;

/**
 * Repository for working with users table.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
