package com.minh.liquibase.springbootliquibase.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Data
@Builder
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column
    private String code;
    @Column
    private String isoCode;
    @ManyToOne
    @JoinColumn(name="region_id")
    @JsonIgnore
    private Region region;

}
