package com.javaprojeto.projetojava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojeto.projetojava.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
