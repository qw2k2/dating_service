package ru.example.dating_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.dating_service.model.Like;

import java.util.Optional;

/**
 * Repository for likes.
 */
public interface LikeRepository extends JpaRepository<Like, Long> {

    /**
     * Finds like by users.
     *
     * @param fromUserId liker
     * @param toUserId liked user
     * @return like
     */
    Optional<Like> findByFromUserIdAndToUserId(Long fromUserId, Long toUserId);
}
