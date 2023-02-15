package org.example.entity;

import org.example.enums.Gender;
import org.example.enums.Role;

public class User {
    private String name;
    private int age;
    private String email;
    private Role role;
    private Gender gender;

    public User(String name, int age, String email, Role role, Gender gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.role = role;
        this.gender = gender;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", gender=" + gender +
                '}';
    }
}
