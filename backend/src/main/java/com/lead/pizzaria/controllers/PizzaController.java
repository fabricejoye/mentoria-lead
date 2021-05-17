package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Pizza;
import com.lead.pizzaria.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.internal.tools.Klist;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaController {

    @Autowired
    public PizzaRepository pizzaRepository;

    @GetMapping("/pizza")
    public ResponseEntity<List<Pizza>> getPizzas() {
        try {
            List<Pizza> pizzas = pizzaRepository.findAll();
            return new ResponseEntity<>(pizzas, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/pizza")
    public ResponseEntity<Pizza> createPizza(@RequestBody Pizza pizza_recebido) {
        try {
            Pizza pizza = pizzaRepository.save(new Pizza(pizza_recebido.getFlavor(), pizza_recebido.getDuration(),
                    pizza_recebido.isAvailability()));
            return new ResponseEntity<>(pizza, HttpStatus.OK);
        } catch (Exception e) {
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}