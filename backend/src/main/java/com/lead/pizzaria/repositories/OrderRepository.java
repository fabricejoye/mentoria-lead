package com.lead.pizzaria.repositories;

import com.lead.pizzaria.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
