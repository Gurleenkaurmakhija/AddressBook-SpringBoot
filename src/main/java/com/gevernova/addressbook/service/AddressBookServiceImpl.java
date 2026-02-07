package com.gevernova.addressbook.service;

import com.gevernova.addressbook.dto.AddressBookDTO;
import com.gevernova.addressbook.exception.AddressBookException;
import com.gevernova.addressbook.model.AddressBook;
import com.gevernova.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    private AddressBookRepository repository;

    // add new address
    @Override
    public AddressBook add(AddressBookDTO dto) {
        AddressBook address = new AddressBook();
        address.setName(dto.getName());
        address.setPhone(dto.getPhone());
        address.setCity(dto.getCity());
        return repository.save(address);
    }

    // fetch address by id
    @Override
    public AddressBook getById(int id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new AddressBookException("Address not found with id: " + id));
    }

    // fetch all addresses
    @Override
    public List<AddressBook> getAll() {
        return repository.findAll();
    }

    // update address by id
    @Override
    public AddressBook update(int id, AddressBookDTO dto) {
        AddressBook address = getById(id);
        address.setName(dto.getName());
        address.setPhone(dto.getPhone());
        address.setCity(dto.getCity());
        return repository.save(address);
    }

    // delete address by id
    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
