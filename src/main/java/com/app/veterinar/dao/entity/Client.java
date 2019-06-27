package com.app.veterinar.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer clientId;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "ClientModel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
