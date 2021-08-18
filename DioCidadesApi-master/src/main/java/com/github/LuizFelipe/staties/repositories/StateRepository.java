package com.github.LuizFelipe.staties.repositories;

import com.github.LuizFelipe.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
