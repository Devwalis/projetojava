package com.javaprojeto.projetojava.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprojeto.projetojava.gamedto.GameMinDTO;
import com.javaprojeto.projetojava.repository.GameRepository;

@Service
public class GameSevice {

    
    //injetando  uma instancia do meu GameRepository no meu GameService
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
    var result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
    

    }
}

