package com.gevernova.addressbook.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

// DTO for request and response
public class AddressBookDTO {

    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only alphabets")
    private String name;

    private String phone;
    private String city;

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}
