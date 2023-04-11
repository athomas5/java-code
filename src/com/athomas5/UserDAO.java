package com.athomas5;

public interface UserDAO extends DAO<User>{

    public User get(int id);

    public User[] getAll();

    public User save(User user);

    public User update(User user);

    public User delete(int id);
}
