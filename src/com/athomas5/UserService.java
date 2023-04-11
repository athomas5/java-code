package com.athomas5;

public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public User get(int id) {
        return userDAO.get(id);
    }

    public User[] getAll() {
        return userDAO.getAll();
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public void delete(int id) {
        userDAO.delete(id);
    }
}
