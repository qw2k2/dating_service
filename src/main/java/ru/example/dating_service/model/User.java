package ru.example.dating_service.model;

import jakarta.persistence.*;

/**
 * Entity representing user profile.
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * Unique user identifier.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * User name.
     */
    @Column(nullable = false)
    private String name;

    /**
     * User age.
     */
    private Integer age;

    /**
     * Short user biography.
     */
    private String bio;

    /**
     * User gender.
     */
    private String gender;

    /**
     * City where user lives.
     */
    private String city;

    // ===== GETTERS & SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
