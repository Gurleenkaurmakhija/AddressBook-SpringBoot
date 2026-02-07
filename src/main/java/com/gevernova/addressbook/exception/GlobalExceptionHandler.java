package com.gevernova.addressbook.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// global exception handler
@ControllerAdvice
public class GlobalExceptionHandler {

    // handle validation errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleValidation(MethodArgumentNotValidException ex) {
        return ResponseEntity.badRequest()
                .body(ex.getBindingResult().getFieldError().getDefaultMessage());
    }

    // handle address not found
    @ExceptionHandler(AddressBookException.class)
    public ResponseEntity<String> handleAddressBook(AddressBookException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
