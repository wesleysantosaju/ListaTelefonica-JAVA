package com.ws.listatelefonica.controllers;

import com.ws.listatelefonica.model.PhoneBook;
import com.ws.listatelefonica.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/sistemas")
public class PhoneBookController {
    @Autowired
    private final PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping("/phones")
    public ResponseEntity<Iterable<PhoneBook>> getPhoneBooks(){
        return ResponseEntity.ok(phoneBookService.getPhoneBooks());
    }

    @PostMapping("/phones")
    public ResponseEntity<PhoneBook> create(@RequestBody @Valid PhoneBook phoneBook){
        return ResponseEntity.status(HttpStatus.CREATED).body(phoneBookService.create(phoneBook));
    }
}
