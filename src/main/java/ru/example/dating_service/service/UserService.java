package ru.example.dating_service.service;

import org.springframework.stereotype.Service;
import ru.example.dating_service.model.User;
import ru.example.dating_service.repository.UserRepository;

import java.util.List;

/**
 * Service for user operations.
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    /**
     * Constructor for user service.
     *
     * @param userRepository repository for users
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Creates new user profile.
     *
     * @param user user to create
     * @return created user
     */
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Returns all users.
     *
     * @return list of users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Updates existing user.
     *
     * @param user updated user data
     * @return updated user
     */
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setName(user.getName());
        existingUser.setAge(user.getAge());
        existingUser.setBio(user.getBio());
        existingUser.setGender(user.getGender());
        existingUser.setCity(user.getCity());

        return userRepository.save(existingUser);
    }

    /**
     * Deletes user by id.
     *
     * @param id user id
     */
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
