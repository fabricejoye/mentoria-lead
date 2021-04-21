package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Client;
import com.lead.pizzaria.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    public ClientRepository clientRepository;

    @RequestMapping("/client")
    public ResponseEntity<Client> createClient(Client client_recebido) {
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
