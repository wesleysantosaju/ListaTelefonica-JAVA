package com.ws.listatelefonica.repositories;

import com.ws.listatelefonica.model.PhoneBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository extends CrudRepository<PhoneBook, Long> {

}
