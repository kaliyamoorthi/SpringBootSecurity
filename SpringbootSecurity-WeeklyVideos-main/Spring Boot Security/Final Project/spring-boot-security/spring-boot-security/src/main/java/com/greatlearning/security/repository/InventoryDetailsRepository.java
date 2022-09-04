package com.greatlearning.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.security.entity.InventoryDetails;

@Repository
public interface InventoryDetailsRepository extends JpaRepository<InventoryDetails, Integer> {

}
