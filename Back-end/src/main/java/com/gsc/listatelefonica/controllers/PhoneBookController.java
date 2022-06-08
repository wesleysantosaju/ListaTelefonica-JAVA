package com.gsc.listatelefonica.controllers;

import com.gsc.listatelefonica.model.PhoneBook;
import com.gsc.listatelefonica.repositories.PhoneBookRepository;
import com.gsc.listatelefonica.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/phones/{id}")
    public ResponseEntity<PhoneBook> getPhoneBookId(@PathVariable (value = "id") Long Id){
        return ResponseEntity.ok().body(phoneBookService.getPhone(Id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PhoneBook> updatePhoneBook(@PathVariable (value = "id") Long Id, @RequestBody @Valid PhoneBook phoneBook){
        return ResponseEntity.ok(phoneBookService.update(Id, phoneBook));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<PhoneBook> deletePhone(@RequestBody @PathVariable (value = "id") Long Id){
        return ResponseEntity.ok(phoneBookService.delete(Id));
    }

}
