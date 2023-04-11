package com.athomas5;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        UserService userService = new UserService(userDAO);
        UserController userController = new UserController(userService);

        User user0 = new User(0, "Admin 0");
        User user1 = new User(1, "Admin 1");
        User user2 = new User(2, "Admin 2");
        User user3 = new User(3, "Admin 3");
        User user4 = new User(4, "Admin 4");

        userController.save(user0);
        userController.save(user1);
        userController.save(user2);
        userController.save(user3);
        userController.save(user4);

        userController.get(0);
        userController.update(new User(2, "Admin 2 (update)"));

        userController.delete(3);

        User[] users = userController.getAll(0);

        System.out.println("All users:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}