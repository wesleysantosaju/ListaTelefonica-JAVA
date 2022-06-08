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
    private long Id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String comments;
    private Operators operators;

}
