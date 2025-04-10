package com.ojas.ordermicroservice.repository;

import com.ojas.ordermicroservice.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Optional<Order> findByUserEmailAndId(@Param("user_email") String userEmail, @Param("id") Integer orderId);

    List<Order> findAllByUserEmail(String userEmail);
}
