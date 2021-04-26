package com.lead.pizzaria.controllers;

import com.lead.pizzaria.entities.Attendant;
import com.lead.pizzaria.repositories.AttendantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AttendantController {

    @Autowired
    public AttendantRepository attendantRepository;

    public ResponseEntity<Attendant> createAttendant(Attendant attendant_recebido) {
        try {
            Attendant attendant = attendantRepository.save(new Attendant(attendant_recebido.getFirstname(), attendant_recebido.getFirstname(),
                    attendant_recebido.getEmail(), attendant_recebido.getTel()));
            return  new ResponseEntity<>(attendant, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
