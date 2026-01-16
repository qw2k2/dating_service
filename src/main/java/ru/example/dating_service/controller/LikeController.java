package ru.example.dating_service.controller;

import org.springframework.web.bind.annotation.*;
import ru.example.dating_service.model.Like;
import ru.example.dating_service.service.LikeService;

/**
 * REST controller for likes.
 */
@RestController
@RequestMapping("/likes")
public class LikeController {

    private final LikeService likeService;

    public LikeController(LikeService likeService) {
        this.likeService = likeService;
    }

    /**
     * Creates new like.
     *
     * @param like like data
     * @return created like
     */
    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeService.createLike(like);
    }
}
