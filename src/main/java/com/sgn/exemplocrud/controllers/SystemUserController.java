package com.sgn.exemplocrud.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgn.exemplocrud.entities.SystemUser;
import com.sgn.exemplocrud.services.SystemUserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class SystemUserController {

    @Autowired
    private SystemUserService systemUserService;

    @PostMapping
    public ResponseEntity<SystemUser> createUser(@RequestBody SystemUser user) {
        Optional<SystemUser> savedUser = systemUserService.saveUser(user);

        if (savedUser.isPresent()) {
            return new ResponseEntity<>(savedUser.get(), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public Optional<List<SystemUser>> getAllSytemUsers() {

        return systemUserService.getAllUsers();

    }

}
