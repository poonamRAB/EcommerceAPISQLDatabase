package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {

}
