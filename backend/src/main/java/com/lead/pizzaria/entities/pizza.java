package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Dados sobre os tipos de pizzas: calabresa, marguerita, portuguesa
// [calabresa, 0], [Marguerita, 0], [Portuguesa, 5]

@Entity
public class pizza {
    @Id
    @GeneratedValue
    private int id;
    private String flavor;
    private int duration;

    public int getId() {
        return id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
