package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Yan", 38099629813l, "Odessa", 1616145, "USer", "1234");
        System.out.println(user1);
        System.out.println(user1.Login("uSer", "1234") ? " ok" : "not ok");
        User user2 = new User("Not yan", 123456789l, "New York", 464165, "user2", "64615");

        Users users = new Users(user1, user2);
        System.out.println(users);
    }


}
