package com.salon.models.admin;

import com.salon.models.user.User;
import java.util.Objects;

public class Admin extends User {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(status, admin.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "status='" + status + '\'' +
                '}';
    }
}

