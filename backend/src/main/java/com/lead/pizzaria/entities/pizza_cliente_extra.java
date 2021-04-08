package com.lead.pizzaria.entities;

public class pizza_cliente_extra {
    private long id;
    // precisa?
    private long id_cliente;
    // precisa?
    private long id_order;
    // [type, price, duration] = [Extra bacon, 3, 0], [Sem cebola, 0, 0], [Borda recheada, 5, 5]
    private String type;
    private int price;
    private int duration;

    public long getId() {
        return id;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getId_order() {
        return id_order;
    }

    public void setId_order(long id_order) {
        this.id_order = id_order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
