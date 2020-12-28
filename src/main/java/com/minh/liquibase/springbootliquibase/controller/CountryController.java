package com.minh.liquibase.springbootliquibase.controller;

import com.minh.liquibase.springbootliquibase.model.Country;
import com.minh.liquibase.springbootliquibase.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {
    private final CountryRepository countryRepository;
    public CountryController(final CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }
    @GetMapping("list")
    public List<Country> findAll(){
        return this.countryRepository.findAll();
    }
    @GetMapping("create")
    public Country createCountry(){
        Country country = Country.builder().code("USD").isoCode("USD").name("US Dollar").build();
        return countryRepository.saveAndFlush(country);
    }

}
