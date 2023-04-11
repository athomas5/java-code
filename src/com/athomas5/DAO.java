package com.athomas5;

public interface DAO<T> {
    T get(int id);

    T[] getAll();

    T save(T t);

    T update(T t);

    T delete(int id);
}
