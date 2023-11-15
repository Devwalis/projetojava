package com.javaprojeto.projetojava.gamedto;

import com.javaprojeto.projetojava.entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public GameListDTO(){

    
    }
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();

    }

}