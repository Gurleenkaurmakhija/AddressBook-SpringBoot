package com.gevernova.addressbook.service;

import com.gevernova.addressbook.dto.AddressBookDTO;
import com.gevernova.addressbook.model.AddressBook;

import java.util.List;

// service contract
public interface AddressBookService {

    AddressBook add(AddressBookDTO dto);

    AddressBook getById(int id);

    List<AddressBook> getAll();

    AddressBook update(int id, AddressBookDTO dto);

    void delete(int id);
}
