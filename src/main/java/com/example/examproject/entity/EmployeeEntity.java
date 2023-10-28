package com.example.examproject.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "employee")

public class EmployeeEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private String Address;
    private Date birthday;
    private String position;
    private String Department;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String fullName, String address, Date birthday, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        Address = address;
        this.birthday = birthday;
        this.position = position;
        Department = department;
    }

    public EmployeeEntity(String fullName, String address, Date birthday, String position, String department) {
        this.fullName = fullName;
        Address = address;
        this.birthday = birthday;
        this.position = position;
        Department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
