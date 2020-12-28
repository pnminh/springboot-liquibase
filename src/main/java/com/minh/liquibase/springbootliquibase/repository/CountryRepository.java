package com.minh.liquibase.springbootliquibase.repository;

import com.minh.liquibase.springbootliquibase.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
