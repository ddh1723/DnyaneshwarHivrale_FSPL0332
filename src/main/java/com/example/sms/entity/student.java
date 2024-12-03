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



        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private boolean isActive;
        private String createdBy;
        private LocalDateTime createdDate;
        private String updatedBy;
        private LocalDateTime updatedDate;




    }

