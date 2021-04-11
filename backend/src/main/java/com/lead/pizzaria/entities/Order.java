package com.lead.pizzaria.entities;

import java.util.Date;

public class Order {
    private long id;
    private Client client;
    private Attendant attendant;
    private Pizza pizza;
    private Pizza_size pizza_size;
    // Indica se tem extra no pedido > Lista está em pizza_extra_cliente
    private boolean has_pizza_extra;
    private Pizza_extra[] pizza_extra;

    // Order
    // state = [finalizado, abandonado (>24h), cancelado (botão), andamento (<24h)]
    private String state;
    // 1 = montar pizza; 2 = personalizar pizza; 3 = montar pedido
    private int step;
    // Total price
    private int price;
    // Total duration
    private int duration;
    private Date data_created;
    private Date data_finished;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Attendant getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza_size getPizza_size() {
        return pizza_size;
    }

    public void setPizza_size(Pizza_size pizza_size) {
        this.pizza_size = pizza_size;
    }

    public boolean isHas_pizza_extra() {
        return has_pizza_extra;
    }

    public void setHas_pizza_extra(boolean has_pizza_extra) {
        this.has_pizza_extra = has_pizza_extra;
    }

    public Pizza_extra[] getPizza_extra() {
        return pizza_extra;
    }

    public void setPizza_extra(Pizza_extra[] pizza_extra) {
        this.pizza_extra = pizza_extra;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
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

    public Date getData_created() {
        return data_created;
    }

    public void setData_created(Date data_created) {
        this.data_created = data_created;
    }

    public Date getData_finished() {
        return data_finished;
    }

    public void setData_finished(Date data_finished) {
        this.data_finished = data_finished;
    }
}
