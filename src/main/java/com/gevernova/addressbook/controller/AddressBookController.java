package com.gevernova.addressbook.controller;

import com.gevernova.addressbook.dto.AddressBookDTO;
import com.gevernova.addressbook.model.AddressBook;
import com.gevernova.addressbook.service.AddressBookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    // create address
    @PostMapping
    public ResponseEntity<AddressBook> add(@Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.add(dto));
    }

    // get address by id
    @GetMapping("/{id}")
    public ResponseEntity<AddressBook> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getById(id));
    }

    // get all addresses
    @GetMapping
    public ResponseEntity<List<AddressBook>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // update address by id
    @PutMapping("/{id}")
    public ResponseEntity<AddressBook> update(
            @PathVariable int id,
            @Valid @RequestBody AddressBookDTO dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

    // delete address by id
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok("Address deleted successfully");
    }
}
