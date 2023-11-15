package com.javaprojeto.projetojava.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaprojeto.projetojava.entities.Game;
import com.javaprojeto.projetojava.gamedto.GameDTO;
import com.javaprojeto.projetojava.gamedto.GameMinDTO;
import com.javaprojeto.projetojava.repository.GameRepository;

@Service
public class GameSevice {

    
    //injetando  uma instancia do meu GameRepository no meu GameService
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
    var result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
    

    }
}

