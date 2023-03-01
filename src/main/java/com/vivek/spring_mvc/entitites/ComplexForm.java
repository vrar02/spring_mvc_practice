package com.vivek.spring_mvc.entitites;

import java.util.Date;
import java.util.List;

public class ComplexForm {

    private String username;
    private Long id;
    private Date dob;
    private List<String> cars;
    private String vehicle1;
    private String vehicle2;
    private String vehicle3;
    private String gender;
    private String technology;

    public ComplexForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public String getVehicle1() {
        return vehicle1;
    }

    public void setVehicle1(String vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public String getVehicle2() {
        return vehicle2;
    }

    public void setVehicle2(String vehicle2) {
        this.vehicle2 = vehicle2;
    }

    public String getVehicle3() {
        return vehicle3;
    }

    public void setVehicle3(String vehicle3) {
        this.vehicle3 = vehicle3;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
