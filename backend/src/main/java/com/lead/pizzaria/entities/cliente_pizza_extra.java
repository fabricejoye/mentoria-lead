package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class cliente_pizza_extra {
    @Id
    @GeneratedValue
    private long id;
    private long id_cliente;
    private long id_order;
    // reference to pizza_extra
    private int id_pizza_extra;

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

    public int getId_pizza_extra() {
        return id_pizza_extra;
    }

    public void setId_pizza_extra(int id_pizza_extra) {
        this.id_pizza_extra = id_pizza_extra;
    }
}
