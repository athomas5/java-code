package com.athomas5;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void save(User user) {
        userService.save(user);
    }

    public User get(int id) {
        return userService.get(id);
    }

    public User[] getAll(int id) {
        return userService.getAll();
    }

    public void update(User user) {
        userService.update(user);
    }

    public void delete(int id) {
        userService.delete(id);
    }
}
