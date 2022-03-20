package com.salon.models.client;

import com.salon.models.user.User;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

public class Client extends User{

    private int clientID;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    private String sex;

    public Client() {
    }

    public Client(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Client(String name, Date birthDate, String sex) {
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public Client(String login, String pass, String name, Date birthDate, String sex) {
        super(login, pass);
        this.name = name;
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientID == client.clientID && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate) && Objects.equals(sex, client.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, name, birthDate, sex);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", sex='" + sex + '\'' +
                '}';
    }
}
