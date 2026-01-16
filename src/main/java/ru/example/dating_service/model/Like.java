package ru.example.dating_service.model;

import jakarta.persistence.*;

/**
 * Entity representing user like.
 */
@Entity
@Table(name = "likes")
public class Like {

    /**
     * Like identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * User who liked.
     */
    @Column(nullable = false)
    private Long fromUserId;

    /**
     * User who was liked.
     */
    @Column(nullable = false)
    private Long toUserId;

    public Long getId() {
        return id;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
}
