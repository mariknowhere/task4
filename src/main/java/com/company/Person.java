package com.company;

public class Person {
    private final String firstName;
    private final String surName;
    private final String lastName;
    private final String address;
    private final String phone;

    public Person(String firstName, String surName, String lastName, String address, String phone) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
