package com.athomas5;

public class UserDAOImpl implements UserDAO {
    private final User[] users = new User[10];
    private int nextId = 0;

    public UserDAOImpl() {
    }

    public void initDatabase() {
        users[0] = User.builder().id(0).name("Admin").build();
        users[1] = User.builder().id(1).name("Bob").build();
        users[2] = User.builder().id(2).name("Alice").build();
        users[3] = User.builder().id(3).name("John").build();
        users[4] = User.builder().id(4).name("Jane").build();

        nextId = 5;
    }

    public User save(User user) {
        System.out.println("Saving user: " + user);
        users[nextId] = user;
        nextId++;
        return user;
    }

    public User get(int id) {
        System.out.println("Getting user: " + users[id].toString());
        return users[id];
    }

    public User[] getAll() {
        return users;
    }

    public User update(User user) {
        System.out.println("Updating user: " + user);
        User updatedUser = null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == user.getId()) {
                users[i] = user;
                updatedUser =  user;
                break;
            }
        }

        return updatedUser;
    }

    public User delete(int id) {
        System.out.println("Deleting user: " + id);
        User deletedUser = null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
                deletedUser =  users[i];
                break;
            }
        }

        return deletedUser;
    }
}
