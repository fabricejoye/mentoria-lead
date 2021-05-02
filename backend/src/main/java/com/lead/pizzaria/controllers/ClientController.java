package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Client;
import com.lead.pizzaria.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    public ClientRepository clientRepository;

    @GetMapping("/client")
    public ResponseEntity<List<Client>> getClients() {
        try {
            List<Client> clients = clientRepository.findAll();
            return new ResponseEntity<>(clients, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/client")
    public ResponseEntity<Client> createClient(@RequestBody Client client_recebido) {
        try {
            Client client = clientRepository.save(new Client(client_recebido.getFirstname(),
                    client_recebido.getLastname(), client_recebido.getEmail(), client_recebido.getTel(),
                    client_recebido.getStreet(), client_recebido.getStreetNumber(), client_recebido.getCity(),
                    client_recebido.getZipcode(), client_recebido.getDistrict(), client_recebido.getHint()) );
            return new ResponseEntity<>(client, HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
