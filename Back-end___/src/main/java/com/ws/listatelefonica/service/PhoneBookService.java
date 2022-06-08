package com.ws.listatelefonica.service;

import com.ws.listatelefonica.model.PhoneBook;
import com.ws.listatelefonica.repositories.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Iterable<PhoneBook> getPhoneBooks(){
        return phoneBookRepository.findAll();
    }

    public PhoneBook create(PhoneBook phoneBook){
        return phoneBookRepository.save(phoneBook);
    }
}
