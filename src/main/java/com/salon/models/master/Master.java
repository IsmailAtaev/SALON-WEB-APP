package com.salon.models.master;


import com.salon.models.type_of_service.TypeOfService;
import java.util.Objects;

public class Master extends TypeOfService {

    private int masterID;

    private int serviceTypeID;

    private String name;

    private String experience;

    public Master() {
    }

    public Master(int masterID, int serviceTypeID, String name, String experience) {
        this.masterID = masterID;
        this.serviceTypeID = serviceTypeID;
        this.name = name;
        this.experience = experience;
    }

    public int getMasterID() {
        return masterID;
    }

    public void setMasterID(int masterID) {
        this.masterID = masterID;
    }

    public int getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(int serviceTypeID) {
        this.serviceTypeID = serviceTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameMaster) {
        this.name = nameMaster;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Master master = (Master) o;
        return masterID == master.masterID && serviceTypeID == master.serviceTypeID
                && Objects.equals(name, master.name) && Objects.equals(experience, master.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), masterID, serviceTypeID, name, experience);
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterID=" + masterID +
                ", serviceTypeID=" + serviceTypeID +
                ", nameMaster='" + name + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}