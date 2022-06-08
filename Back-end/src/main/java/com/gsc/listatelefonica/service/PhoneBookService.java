package com.gsc.listatelefonica.service;

import com.gsc.listatelefonica.model.PhoneBook;
import com.gsc.listatelefonica.repositories.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PhoneBookService {
    //injeção de dependencia
    @Autowired
    private PhoneBookRepository phoneBookRepository;

    //constructor
    public PhoneBookService(PhoneBookRepository phoneBookRepository){
        this.phoneBookRepository = phoneBookRepository;
    }

    // metodos
    public PhoneBook getPhone(Long id){
        return phoneBookRepository.findById(id)
                .orElseThrow();
    }
    public Iterable<PhoneBook> getPhoneBooks(){
        return phoneBookRepository.findAll();
    }

    public PhoneBook create(PhoneBook phoneBook){
        return phoneBookRepository.save(phoneBook);
    }

    public PhoneBook update(Long id, PhoneBook phoneBook){
        PhoneBook updatePhone = phoneBookRepository.findById(id).orElseThrow();
        updatePhone.setName(phoneBook.getName());
        updatePhone.setAddress(phoneBook.getAddress());
        updatePhone.setPhone(phoneBook.getPhone());
        updatePhone.setEmail(phoneBook.getEmail());
        updatePhone.setComments(phoneBook.getComments());
        updatePhone.setOperators(phoneBook.getOperators());

        PhoneBook upPhones = phoneBookRepository.save(updatePhone);
        return upPhones;
    }

    public PhoneBook delete(Long id){
        PhoneBook deletePhone = phoneBookRepository.findById(id).orElseThrow();
        phoneBookRepository.delete(deletePhone);
        return deletePhone;
    }



}
