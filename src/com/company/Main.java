package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Yan", 38099629813l, "Odessa", 1616145, "USer", "1234");
        System.out.println(user1);
        System.out.println(user1.Login("uSer", "1234") ? " ok" : "not ok");
        User user2 = new User("Yan", 123456789l, "New York", 464165, "user2", "64615");

        DataBase dataBase = new DataBase();
        dataBase.Add(user1);
        dataBase.Add(user2);
        System.out.println(dataBase);
        System.out.println();
        System.out.println(dataBase.Search("Yan"));


    }


}
