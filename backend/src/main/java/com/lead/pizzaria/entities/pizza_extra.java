package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Dados: extra, preço e duração
// [Extra bacon, 3, 0], [Sem cebola, 0, 0], [Borda recheada, 5, 5]

@Entity
public class pizza_extra {
    @Id
    @GeneratedValue
    private int id;
    private String extra;
    private int price;
    private int duration;

    public int getId() {
        return id;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}