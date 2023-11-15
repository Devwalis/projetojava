package com.javaprojeto.projetojava.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_gamelist")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;




    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameList)) {
            return false;
        }
        GameList gameList = (GameList) o;
        return Objects.equals(id, gameList.id) && Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public GameList(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public GameList(){

    }
}
