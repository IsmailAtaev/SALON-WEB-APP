package com.salon.models.appointment;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.Objects;

public class Appointment {

    private int clientID;

    private int masterID;

    private String appointments;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String time;

    public Appointment() {
    }

    public Appointment(int clientID, int masterID, String appointments, Date date, String time) {
        this.clientID = clientID;
        this.masterID = masterID;
        this.appointments = appointments;
        this.date = date;
        this.time = time;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getMasterID() {
        return masterID;
    }

    public void setMasterID(int masterID) {
        this.masterID = masterID;
    }

    public String getAppointments() {
        return appointments;
    }

    public void setAppointments(String appointments) {
        this.appointments = appointments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return clientID == that.clientID && masterID == that.masterID && Objects.equals(appointments, that.appointments) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientID, masterID, appointments, date, time);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "clientID=" + clientID +
                ", masterID=" + masterID +
                ", appointments='" + appointments + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                '}';
    }
}