package com.javaprojeto.projetojava.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Belonging)) {
            return false;
        }
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id) && Objects.equals(position, belonging.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }

    public Belonging(Game game, GameList list, Integer position) {
        this.id.setGame(game);
        this.position = position;
    }


    public Belonging() {
    }
        
    
}

    