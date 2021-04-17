package com.lead.pizzaria.entities;

// Dados: sabor, preço
// [calabresa, 0], [marguerita, 0], [portuguesa, 0]

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private int id;
    private String flavor;
    private int duration;
    private boolean availability;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
