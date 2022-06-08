package com.gsc.listatelefonica.repositories;

import com.gsc.listatelefonica.model.PhoneBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository extends CrudRepository<PhoneBook, Long> {
}
