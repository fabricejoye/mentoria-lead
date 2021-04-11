package com.lead.pizzaria.entities;

// Dados: sabor, preço
// [calabresa, 0], [marguerita, 0], [portuguesa, 0]

import java.util.Date;

public class Pizza {
    private int id;
    private String flavor;
    private int duration;
    private boolean availability;
    private Date dataCreated;

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
