package com.lead.pizzaria.entities;

public class pizza_cliente {
    private long id;
    // precisa?
    private long id_cliente;
    // precisa?
    private long id_order;
    // calabresa, marguerita, portuguesa
    private String flavor;
    // [size, duration, price] = [pequena, 20, 15], [media, 30, 20], [grande, 40, 25]
    private String size;
    private int duration;
    // os preços são inteiros
    // ou flexibilizar (float) se muda no futuro?
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
