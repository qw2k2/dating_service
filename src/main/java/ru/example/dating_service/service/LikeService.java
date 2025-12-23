package ru.example.dating_service.service;

import org.springframework.stereotype.Service;
import ru.example.dating_service.model.Like;
import ru.example.dating_service.repository.LikeRepository;

/**
 * Service for likes.
 */
@Service
public class LikeService {

    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    /**
     * Creates like between users.
     *
     * @param like like data
     * @return saved like
     */
    public Like createLike(Like like) {
        return likeRepository.save(like);
    }
}
