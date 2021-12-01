package com.estevaocsouza.geolocationapi.repositories;

import com.estevaocsouza.geolocationapi.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
