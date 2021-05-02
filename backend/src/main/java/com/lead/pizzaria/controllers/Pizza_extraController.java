package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Pizza_extra;
import com.lead.pizzaria.repositories.PizzaExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Pizza_extraController {

    @Autowired
    public PizzaExtraRepository pizzaExtraRepository;

    @GetMapping("/pizzaextra")
    public ResponseEntity<List<Pizza_extra>> getPizzaExtra() {
        try {
            List<Pizza_extra> pizza_extras = pizzaExtraRepository.findAll();
            return  new ResponseEntity<>(pizza_extras, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/pizzaextra")
    public ResponseEntity<Pizza_extra> createPizzaExtra(@RequestBody Pizza_extra pizza_extra_recebido) {
        try {
            Pizza_extra pizza_extra = pizzaExtraRepository.save(new Pizza_extra(pizza_extra_recebido.getExtra(),
                    pizza_extra_recebido.getPrice(), pizza_extra_recebido.getDuration(),
                    pizza_extra_recebido.isAvailability()));
            return new ResponseEntity<>(pizza_extra, HttpStatus.OK);
        } catch(Exception e) {
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
