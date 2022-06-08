package com.ws.listatelefonica.model;

import com.ws.listatelefonica.enums.Operators;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "phone_book")
public class PhoneBook {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String comments;
    private Operators operators;

    //region Bloco - Construtores
    public PhoneBook(){}

    public PhoneBook(String name, String address, String phone, String email, String comments, Operators operators) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.comments = comments;
        this.operators = operators;
    }
    //endregion

    //region Bloco - Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Operators getOperators() {
        return operators;
    }

    public void setOperators(Operators operators) {
        this.operators = operators;
    }
    //endregion
}
