package com.example.sms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

    @Getter
    @Setter
    @Entity
    @Table(name = "students")
    public class student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(nullable = false, length = 50)
        private String firstName;

        @Column(length = 50)
        private String middleName;

        @Column(nullable = false, length = 50)
        private String lastName;

        @Column(nullable = false, unique = true, length = 100)
        private String email;

        @Column(nullable = false, unique = true, length = 15)
        private String phoneNumber;

        @Column(nullable = false)
        private boolean isActive;

        @Column(nullable = true, length = 50)
        private String createdBy;

        @Column(nullable = true)
        private LocalDateTime createdDate;

        @Column(nullable = true, length = 50)
        private String updatedBy;

        @Column(nullable = true)
        private LocalDateTime updatedDate;




    }

