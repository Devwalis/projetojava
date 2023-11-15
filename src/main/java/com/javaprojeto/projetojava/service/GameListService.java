package com.javaprojeto.projetojava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaprojeto.projetojava.entities.GameList;
import com.javaprojeto.projetojava.gamedto.GameListDTO;
import com.javaprojeto.projetojava.repository.GameListRepository;
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
    
}
}