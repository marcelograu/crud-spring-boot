package com.sgn.exemplocrud.entities;

import java.time.LocalDate;

import com.sgn.exemplocrud.entities.enuns.UserRole;

public class User {

    private Integer id;

    private String name;

    private UserRole role;

    private String passWord;

    private LocalDate creationDate;

    public User() {

    }

    public User(String name, UserRole role, String passWord, LocalDate creationDate) {
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

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", role=" + role + ", passWord=" + passWord + ", creationDate="
                + creationDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
        result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (role != other.role)
            return false;
        if (passWord == null) {
            if (other.passWord != null)
                return false;
        } else if (!passWord.equals(other.passWord))
            return false;
        if (creationDate == null) {
            if (other.creationDate != null)
                return false;
        } else if (!creationDate.equals(other.creationDate))
            return false;
        return true;
    }

}
