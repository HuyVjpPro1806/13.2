package com.he110w0r1d.business;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")  // 👈 map tới bảng đúng tên trong MySQL
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO ok, nhưng IDENTITY hợp với MySQL
    @Column(name = "UserID")  // map đúng cột
    private Long userId;

    @Column(name = "EmailAddress")  // 👈 map đúng cột trong DB
    private String email;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    public User() {}

    // getters/setters
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
