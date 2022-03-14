package com.salon.models.service;

import com.salon.models.type_of_service.TypeOfService;
import java.util.Objects;

public class Service {

    private int serviceID;

    private String name;

    private double price;

    public Service() {
    }

    public Service(int serviceID, String name, double price) {
        this.serviceID = serviceID;
        this.name = name;
        this.price = price;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Service service = (Service) o;
        return serviceID == service.serviceID && Double.compare(service.price, price) == 0 && name.equals(service.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), serviceID, name, price);
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceID=" + serviceID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


