package com.sgn.exemplocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgn.exemplocrud.entities.SystemUser;

public interface SystemUserRepository extends JpaRepository<SystemUser, Integer> {

}
