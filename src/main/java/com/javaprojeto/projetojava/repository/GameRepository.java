package com.javaprojeto.projetojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojeto.projetojava.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long> {
    
}
