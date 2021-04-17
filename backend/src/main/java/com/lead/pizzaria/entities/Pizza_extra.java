package com.lead.pizzaria.entities;

// Dados: extra, preço e duração
// [Extra bacon, 3, 0], [Sem cebola, 0, 0], [Borda recheada, 5, 5]

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pizza_extra {

    @Id
    @GeneratedValue
    private int id;
    private String extra;
    private int price;
    private int duration;
    private boolean availability;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

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
