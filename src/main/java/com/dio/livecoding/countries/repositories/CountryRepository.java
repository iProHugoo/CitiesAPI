package com.dio.livecoding.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.livecoding.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
