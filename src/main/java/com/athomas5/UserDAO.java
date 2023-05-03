package com.athomas5;

public interface UserDAO extends DAO<User>{
    User get(int id);

    User[] getAll();

    User save(User user);

    User update(User user);

    User delete(int id);
}
