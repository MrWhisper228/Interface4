package com.company;

import java.util.Arrays;

public class Users {
    User[] users;

    public Users(User... users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
