package com.athomas5;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User save(User user) {
        return userService.save(user);
    }

    public User get(int id) {
        return userService.get(id);
    }

    public User[] getAll(int id) {
        return userService.getAll();
    }

    public User update(User user) {
        return userService.update(user);
    }

    public User delete(int id) {
        return userService.delete(id);
    }
}
