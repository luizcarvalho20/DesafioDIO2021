package com.github.LuizFelipe.countries.repositories;

import com.github.LuizFelipe.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
