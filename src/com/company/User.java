package com.company;

import java.util.Arrays;
import java.util.Locale;

public class User implements IPerson, IUser {
    private String name;
    private Long phoneNum;
    private String address;
    private String[] contacts;
    private int ip;
    private String login;
    private String password;
    private boolean isDeleted;

    public User(String name, Long phoneNum, String address, int ip, String login, String password) {
        this.setName(name);
        this.setPhoneNum(phoneNum);
        this.setAddress(address);
        this.setIp(ip);
        this.setLogin(login);
        this.setPassword(password);
        contacts = new String[3];
        contacts[0] = name;
        contacts[1] = address;
        contacts[2] = phoneNum.toString();

    }

    /**
     * deleted status
     * @return
     */
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public User() {
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip > 0 ? ip : -1;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login.strip();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password.strip();
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum > 0 ? phoneNum : -1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.strip();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.strip();
    }

    public String[] getContacts() {
        return contacts;
    }

    public void setContacts(String[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void getUserName() {
        getName();
    }

    @Override
    public String getUserContacts() {
        return contacts.toString();
    }

    /**
     * connects user for selected ip
     * @param ip ip for connection
     * @return connection status
     */
    @Override
    public boolean Connect(int ip) {
        return true;
    }

    /**
     * authorization process
     * @param login login used
     * @param password password used
     * @return logining status
     */
    @Override
    public boolean Login(String login, String password) {
        return login.toLowerCase(Locale.ROOT).equals(getLogin().toLowerCase()) && password.hashCode() == getPassword().hashCode() ? true : false;

    }

    /**
     * cast user to string
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                ", contacts=" + Arrays.toString(contacts) +
                ", ip=" + ip +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}
