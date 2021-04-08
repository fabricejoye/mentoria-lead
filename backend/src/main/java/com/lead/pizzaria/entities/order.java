package com.lead.pizzaria.entities;

public class order {
    private long id;
    private long id_cliente;
    private long id_pizza_cliente;
    // se cliente pediu ou não extra
    private boolean pizza_extra_state;
    private long id_pizza_cliente_extra;
    // state = [finalizado, abandonado (>24h), cancelado (botão), andamento (<24h)]
    private String state;
    // 1 = montar pizza; 2 = personalizar pizza; 3 = montar pedido
    private int step;
    private float price;
    private float duration;
    private long data_created;
    private long data_finished;

    public void abandon_order(int id_order) {}

    public void add_pizza_cliente(String size, int duration, int price) {}

    public void add_pizza_extra(String type, int price, int duration) {}

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

    public long getId_pizza_cliente() {
        return id_pizza_cliente;
    }

    public void setId_pizza_cliente(long id_pizza_cliente) {
        this.id_pizza_cliente = id_pizza_cliente;
    }

    public boolean isPizza_extra_state() {
        return pizza_extra_state;
    }

    public void setPizza_extra_state(boolean pizza_extra_state) {
        this.pizza_extra_state = pizza_extra_state;
    }

    public long getId_pizza_cliente_extra() {
        return id_pizza_cliente_extra;
    }

    public void setId_pizza_cliente_extra(long id_pizza_cliente_extra) {
        this.id_pizza_cliente_extra = id_pizza_cliente_extra;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public long getData_created() {
        return data_created;
    }

    public void setData_created(long data_created) {
        this.data_created = data_created;
    }

    public long getData_finished() {
        return data_finished;
    }

    public void setData_finished(long data_finished) {
        this.data_finished = data_finished;
    }
}
