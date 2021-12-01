package com.estevaocsouza.geolocationapi.repositories;

import com.estevaocsouza.geolocationapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
