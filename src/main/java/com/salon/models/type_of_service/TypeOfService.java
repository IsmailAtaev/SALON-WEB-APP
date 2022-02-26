package com.salon.models.type_of_service;

import java.util.Objects;

public class TypeOfService {

    private int typeOfServiceID;

    private String typeOfServiceName;


    public int getTypeOfServiceID() {
        return typeOfServiceID;
    }

    public void setTypeOfServiceID(int typeOfServiceID) {
        this.typeOfServiceID = typeOfServiceID;
    }

    public String getTypeOfServiceName() {
        return typeOfServiceName;
    }

    public void setTypeOfServiceName(String typeOfServiceName) {
        this.typeOfServiceName = typeOfServiceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfService that = (TypeOfService) o;
        return typeOfServiceID == that.typeOfServiceID && typeOfServiceName == that.typeOfServiceName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfServiceID, typeOfServiceName);
    }

    @Override
    public String toString() {
        return "TypeOfService{" +
                "typeOfServiceID=" + typeOfServiceID +
                ", typeOfServiceName=" + typeOfServiceName +
                '}';
    }

    public TypeOfService() {
        super();
    }

    public TypeOfService(String typeOfServiceName) {
        this.typeOfServiceName = typeOfServiceName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new TypeOfService(this.typeOfServiceName);
    }
}
