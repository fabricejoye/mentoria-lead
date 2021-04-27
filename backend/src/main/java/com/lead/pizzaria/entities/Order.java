package com.lead.pizzaria.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="CLIENT_ORDER")
public class Order {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attendant_ID")
    private Attendant attendant;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_ID")
    private Client client;
    @OneToOne
    @JoinColumn(name = "pizza_ID")
    private Pizza pizza;
    @OneToOne
    @JoinColumn(name = "pizza_size_ID")
    private Pizza_size pizza_size;
    // Indica se tem extra no pedido > Lista está em pizza_extra_cliente
    private boolean has_pizza_extra;
    @OneToMany
    @JoinColumn(name = "pizza_extra_ID")
    private List<Pizza_extra> pizza_extra;

    // Order
    // state = [finalizado, abandonado (>24h), cancelado (botão), andamento (<24h)]
    private String state;
    // 1 = montar pizza; 2 = personalizar pizza; 3 = montar pedido
    private int step;
    // Total price
    private int price;
    // Total duration
    private int duration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishedDate;

    public Attendant getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getId() {
        return id;
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

    public List<Pizza_extra> getPizza_extra() {
        return pizza_extra;
    }

    public void setPizza_extra(List<Pizza_extra> pizza_extra) {
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }
}
