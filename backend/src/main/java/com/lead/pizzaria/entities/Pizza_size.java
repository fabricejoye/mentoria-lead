package com.lead.pizzaria.entities;

import javax.persistence.*;
import java.util.Date;

// Dados: [tamanho, preço, tempo]
// Já preenchidos: [pequena, 20, 15], [média, 20, 30], [grande, 40, 25]

@Entity
public class Pizza_size {
    @Id
    @GeneratedValue
    private int id;
    private String size;
    private int price;
    private int duration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Pizza_size(String size, int price, int duration) {
        this.size = size;
        this.price = price;
        this.duration = duration;
        // Check??
        //this.creationDate = new Date(System.currentTimeMillis());
    }

    public Pizza_size() {}

    public int getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
