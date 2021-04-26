package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Pizza_size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaSizeRepository extends JpaRepository<Pizza_size,Long> {
}
