package com.sgn.exemplocrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sgn.exemplocrud.entities.SystemUser;
import com.sgn.exemplocrud.repositories.SystemUserRepository;

@Service
public class SystemUserService {

    @Autowired
    private SystemUserRepository systemUserRepository;

    public Optional<SystemUser> saveUser(SystemUser user) {

        return Optional.ofNullable(systemUserRepository.save(user));
    }

    @Autowired
    public Optional<List<SystemUser>> getAllUsers() {
        return Optional.ofNullable(systemUserRepository.findAll());
    }

}
