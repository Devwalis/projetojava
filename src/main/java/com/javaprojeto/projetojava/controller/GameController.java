package com.javaprojeto.projetojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojeto.projetojava.gamedto.GameDTO;
import com.javaprojeto.projetojava.gamedto.GameMinDTO;
import com.javaprojeto.projetojava.service.GameSevice;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    //Injetando o service
    @Autowired
    private GameSevice gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    
    
    }

    @GetMapping(value = "/{id}" )
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
}
}