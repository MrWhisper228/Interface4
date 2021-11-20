package com.company;

import java.util.Arrays;

public class DataBase implements IDataBase {
    User users[];

    public DataBase() {
        this.users = new User[0];
    }

    /**
     * add user to database
     *
     * @param user added user
     */
    @Override
    public void Add(User user) {
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
    }

    /**
     * marks user as deleted
     *
     * @param index marked deleted
     */
    @Override
    public void Delete(int index) {
        users[index].setDeleted(true);
    }


    /**
     * Delete marked users
     */
    @Override
    public void Pack() {
        for (int i = 0; i < users.length; i++) {
            if (users[i].isDeleted()) {
                Remove(i);
            }
        }

    }

    /**
     * removes object from array
     * @param index objets's index
     */
    private void Remove(int index) {
        for (int i = index; i < this.users.length; i++) {
            this.users[i] = this.users[i + 1];
        }
        this.users = Arrays.copyOf(this.users, this.users.length - 1);
    }

    /**
     * search for user from login or name
     * @param searchText text for searching
     * @return database with results
     */
    @Override
    public DataBase Search(String searchText) {
        DataBase temp = new DataBase();
        if (searchText != null) {
            for (int i = 0; i < this.users.length; i++) {
                if (this.users[i].getName().equalsIgnoreCase(searchText) || this.users[i].getLogin().equalsIgnoreCase(searchText)) {
                    temp.Add(users[i]);
                }

            }


        }
        return temp.users.length == 0 ? null : temp;
    }

    /**
     * cast database to string
     * @return
     */
    @Override
    public String toString() {
        return "DataBase{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
