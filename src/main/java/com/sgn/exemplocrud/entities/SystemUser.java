package com.sgn.exemplocrud.entities;

import java.time.LocalDate;

import com.sgn.exemplocrud.entities.enuns.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "systemuser")
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private UserRole role;

    @Column(name = "password")
    private String passWord;

    @Column(name = "creationdate")
    private LocalDate creationDate;

    public SystemUser() {

    }

    public SystemUser(String name, UserRole role, String passWord, LocalDate creationDate) {
        this.name = name;
        this.role = role;
        this.passWord = passWord;
        this.creationDate = creationDate;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserRole getRole() {
        return role;
    }

    public String getPassWord() {
        return passWord;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

}
