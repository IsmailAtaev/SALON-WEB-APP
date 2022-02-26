package com.salon.models.client;

import com.salon.models.user.User;

import java.util.Date;
import java.util.Objects;

public class Client extends User {

    private Date birthDate;

    private String sex;


    public Client(Date birthDate, String sex) {
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public Client(int userID, String login, String pass, Date birthDate, String sex) {
        super(userID, login, pass);
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return Objects.equals(birthDate, client.birthDate) && Objects.equals(sex, client.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birthDate, sex);
    }

    @Override
    public String toString() {
        return "Client{" +
                "birthDate=" + birthDate +
                ", sex='" + sex + '\'' +
                '}';
    }
}
