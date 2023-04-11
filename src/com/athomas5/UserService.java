package com.athomas5;

public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User save(User user) {
        return userDAO.save(user);
    }

    public User get(int id) {
        return userDAO.get(id);
    }

    public User[] getAll() {
        return userDAO.getAll();
    }

    public User update(User user) {
        return userDAO.update(user);
    }

    public User delete(int id) {
        return userDAO.delete(id);
    }
}
