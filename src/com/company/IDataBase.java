package com.company;

public interface IDataBase {
    void Add(User user);
    void Delete(int index);
    void Pack();
    String toString();
    DataBase Search(String name);
}
