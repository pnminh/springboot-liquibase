package com.minh.liquibase.springbootliquibase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "region")
@Data
public class Region {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

}
