package com.generation.JUnit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.JUnit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
