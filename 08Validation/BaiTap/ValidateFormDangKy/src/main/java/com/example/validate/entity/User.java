package com.example.validate.entity;

import com.example.validate.common.ValidatedAge;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Size(min =2,max = 45,message = "\n" +
            "First name from 5 to 45 character")
    private String firstName;
    @NotEmpty
    @Size(min = 2,max = 45,message = "\n" +
            "Last name from 5 to 45 character")
    private String lastName;


    @NotEmpty
    @Pattern(regexp="^\\d{10}$",message = "10 Number")
    private String phoneNumber;


    @ValidatedAge
    private String age;


    @Email(message = "\n" +
            "Enter the correct emial format")
    private String Email;


    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
