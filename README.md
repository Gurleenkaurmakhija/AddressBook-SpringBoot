# Address Book Spring Boot Application

This is a Spring Boot based RESTful application developed to manage Address Book data.
This project implements DTO-based data transfer, service-layer architecture, validation, and global exception handling for REST APIs.

---

## Features
- REST APIs for Address Book operations
- Layered architecture (Controller, Service, Repository)
- DTO-based request handling
- Validation and Global Exception Handling
- MySQL database integration
- ResponseEntity-based API responses

---

## Technologies Used
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Hibernate
- Maven

---
## 📂 Project Structure (com.gevernova)

```text
com.gevernova.addressbook
    ├── AddressBookApplication.java
    │
    ├── controller
    │   └── AddressBookController.java
    │
    ├── dto
    │   └── AddressBookDTO.java
    │
    ├── model
    │   └── AddressBook.java
    │
    ├── repository
    │   └── AddressBookRepository.java
    │
    ├── service
    │   ├── AddressBookService.java
    │   └── AddressBookServiceImpl.java
    │
    └── exception
        ├── AddressBookException.java
        └── GlobalExceptionHandler.java


##  API Operations
- Create Address
- Get All Addresses
- Get Address by ID
- Update Address by ID
- Delete Address by ID

---

##  How to Run
1. Configure MySQL credentials in `application.properties`
2. Ensure MySQL server is running
3. Run the Spring Boot application
4. Test APIs using CURL or frontend UI

---

## Architecture Overview
- **Controller**: Handles REST requests
- **DTO**: Transfers request data
- **Model**: Represents database entity
- **Service**: Contains business logic
- **Repository**: Handles database operations
- **Exception**: Centralized error handling

---
