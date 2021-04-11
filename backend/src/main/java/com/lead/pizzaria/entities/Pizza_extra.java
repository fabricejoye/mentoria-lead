package com.lead.pizzaria.entities;

// Dados: extra, preço e duração
// [Extra bacon, 3, 0], [Sem cebola, 0, 0], [Borda recheada, 5, 5]

import java.util.Date;

public class Pizza_extra {

    private int id;
    private String extra;
    private int price;
    private int duration;
    private boolean availability;
    private Date dataCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }
}
