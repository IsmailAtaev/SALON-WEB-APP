package com.salon.models.master;

import com.salon.models.person.Person;
import com.salon.models.type_of_service.TypeOfService;
import java.util.Objects;

public class Master extends Person {

    private int masterID;

    private int serviceTypeID;

    private String nameMaster;

    private String experience;

    public Master() {
    }

    public Master(int masterID, int serviceTypeID, String nameMaster, String experience) {
        this.masterID = masterID;
        this.serviceTypeID = serviceTypeID;
        this.nameMaster = nameMaster;
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

    public String getNameMaster() {
        return nameMaster;
    }

    public void setNameMaster(String nameMaster) {
        this.nameMaster = nameMaster;
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
                && Objects.equals(nameMaster, master.nameMaster) && Objects.equals(experience, master.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), masterID, serviceTypeID, nameMaster, experience);
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterID=" + masterID +
                ", serviceTypeID=" + serviceTypeID +
                ", nameMaster='" + nameMaster + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
