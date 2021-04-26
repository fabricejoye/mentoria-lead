package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Attendant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendantRepository extends JpaRepository<Attendant,Long> {
}
