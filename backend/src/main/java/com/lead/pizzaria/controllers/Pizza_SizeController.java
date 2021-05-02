package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Pizza_size;
import com.lead.pizzaria.repositories.PizzaSizeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Pizza_SizeController {

    public PizzaSizeRepository pizzaSizeRepository;

    @GetMapping("/pizzasize")
    public ResponseEntity<List<Pizza_size>> getPizzaSizes() {
        try {
            List<Pizza_size> pizza_sizes = pizzaSizeRepository.findAll();
            return new ResponseEntity<>(pizza_sizes, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/pizzasize")
    public ResponseEntity<Pizza_size> createPizzaExtra(@RequestBody Pizza_size pizzaSize_recebido) {
        try {
            Pizza_size pizza_size = pizzaSizeRepository.save(new Pizza_size(pizzaSize_recebido.getSize(),
                    pizzaSize_recebido.getPrice(),
                    pizzaSize_recebido.getDuration()));
            return new ResponseEntity<>(pizza_size, HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
