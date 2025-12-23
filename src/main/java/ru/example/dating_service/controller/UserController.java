package ru.example.dating_service.controller;

import org.springframework.web.bind.annotation.*;
import ru.example.dating_service.model.User;
import ru.example.dating_service.service.UserService;

import java.util.List;

/**
 * REST controller for users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /**
     * User controller constructor.
     *
     * @param userService user service
     */
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Creates new user.
     *
     * @param user user data
     * @return created user
     */
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /**
     * Returns all users.
     *
     * @return list of users
     */
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    /**
     * Updates user by id.
     *
     * @param id user id
     * @param user updated user data
     * @return updated user
     */
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userService.updateUser(user);
    }

    /**
     * Deletes user by id.
     *
     * @param id user id
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
