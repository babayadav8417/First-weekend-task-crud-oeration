package com.Prograde.CrudOperation.models;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "StudentDetails")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String address;

}
