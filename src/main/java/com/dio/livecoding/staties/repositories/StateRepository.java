package com.dio.livecoding.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.livecoding.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
