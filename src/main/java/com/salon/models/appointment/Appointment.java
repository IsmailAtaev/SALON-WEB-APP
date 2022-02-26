package com.salon.models.appointment;

import com.salon.models.client.Client;
import com.salon.models.master.Master;
import java.util.Date;
import java.util.Objects;

public class Appointment {

    private Client client;

    private Master master;

    private String appointments;

    private Date date;

    private String time;

    public Appointment() {
    }

    /**
     * Aggregation client and master
     * Aggregation is when an instance of an engine is created somewhere
     * else in the code, and is passed to the constructor as a parameter.
     */
    public Appointment(Client client, Master master, String appointments, Date date, String time) {
        this.client = client;
        this.master = master;
        this.appointments = appointments;
        this.date = date;
        this.time = time;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
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
        return Objects.equals(client, that.client) && Objects.equals(master, that.master)
                && Objects.equals(appointments, that.appointments) && Objects.equals(date, that.date)
                && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, master, appointments, date, time);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "client=" + client +
                ", master=" + master +
                ", appointments='" + appointments + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                '}';
    }
}