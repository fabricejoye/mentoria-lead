package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Client;
import com.lead.pizzaria.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {

    // http://localhost:8080/api
    // GET > Client list > /client
    // GET > One client > /client/{id}
    // POST > New client > /client

    @Autowired
    public ClientRepository clientRepository;

    // GET > Client list
    @GetMapping("/client")
    public ResponseEntity<List<Client>> getClients() {
        try {
            List<Client> clients = clientRepository.findAll();
            return new ResponseEntity<>(clients, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // GET > One client
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Optional<Client> clientData = clientRepository.findById(id);
        if (clientData.isPresent()) {
            return new ResponseEntity<>(clientData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // GET > Find by lastname
    @GetMapping("/getClient")
    public ResponseEntity<Client> getClientByLastname(@RequestParam String lastname) {
        Client clientData = clientRepository.findByLastname(lastname.toLowerCase());
        if (clientData != null) {
            return new ResponseEntity<>(clientData, HttpStatus.OK);
        } else {
            return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    // POST > New client
    @PostMapping("/client")
    public ResponseEntity<Client> createClient(@RequestBody Client client_recebido) {
        try {
            Client client = clientRepository.save(new Client(client_recebido.getFirstname(),
                    client_recebido.getLastname(), client_recebido.getEmail(), client_recebido.getTel(),
                    client_recebido.getStreet(), client_recebido.getStreetNumber(), client_recebido.getCity(),
                    client_recebido.getZipcode(), client_recebido.getDistrict(), client_recebido.getHint(),
                    client_recebido.getCreationDate()) );
            return new ResponseEntity<>(client, HttpStatus.CREATED);
        } catch(Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Delete > client
    @DeleteMapping("/client/{id}")
    public ResponseEntity<HttpStatus> deleteClient(@PathVariable("id") Long id) {
        try {
            clientRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
