package com.salon.models.user;

import com.salon.models.person.Person;
import java.util.Objects;

public class User extends Person {

    private int userID;

    private String login;

    private String pass;

    public User(){

    }

    public User(int userID, String login, String pass) {
        this.userID = userID;
        this.login = login;
        this.pass = pass;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return userID == user.userID && Objects.equals(login, user.login) && Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userID, login, pass);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
