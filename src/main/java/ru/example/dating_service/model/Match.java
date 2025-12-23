package ru.example.dating_service.model;

import jakarta.persistence.*;

/**
 * Entity representing match between users.
 */
@Entity
@Table(name = "matches")
public class Match {

    /**
     * Match identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * First user.
     */
    @Column(nullable = false)
    private Long userId;

    /**
     * Second user.
     */
    @Column(nullable = false)
    private Long targetUserId;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
    }
}
