package com.athomas5;

public class UserDAO {
    private final User[] users = new User[10];
    private int nextId = 0;

    public UserDAO() {
    }

    public void initDatabase() {
        users[0] = new User(0, "Admin");
        users[1] = new User(1, "Bob");
        users[2] = new User(2, "Alice");
        users[3] = new User(3, "John");
        users[4] = new User(4, "Jane");
        nextId = 5;
    }

    public void save(User user) {
        System.out.println("Saving user: " + user);
        users[nextId] = user;
        nextId++;
    }

    public User get(int id) {
        System.out.println("Getting user: " + users[id].toString());
        return users[id];
    }

    public User[] getAll() {
        return users;
    }

    public void update(User user) {
        System.out.println("Updating user: " + user);
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == user.getId()) {
                users[i] = user;
                break;
            }
        }
    }

    public void delete(int id) {
        System.out.println("Deleting user: " + id);
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
                break;
            }
        }
    }
}
