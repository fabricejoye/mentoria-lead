package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Client;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface ClientRepository extends JpaRepository<Client,Long> {

    // Find by nome
    // For Controller GET > findByLastname
    @Query("SELECT c FROM Client WHERE lower(c.lastname) = :lastname")
    Client findByLastname(@Param("lastname") String lastname);

}