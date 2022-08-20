package de.hdi.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.hdi.tm.model.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{
	
	Country findByName(String name);
}
