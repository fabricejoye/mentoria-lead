package com.lead.pizzaria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class order {
    @Id
    @GeneratedValue
    private long id;
    private long id_cliente;

    // reference to Pizza
    private long id_pizza;
    // Tamanho Pizza
    private long id_pizza_size;
    // Indica se tem extra no pedido > Lista está em pizza_extra_cliente
    private boolean has_pizza_extra;

    // Order
    // state = [finalizado, abandonado (>24h), cancelado (botão), andamento (<24h)]
    private String state;
    // 1 = montar pizza; 2 = personalizar pizza; 3 = montar pedido
    private int step;
    // Total price
    private float price;
    // Total duration
    private float duration;
    private long data_created;
    private long data_finished;




}
