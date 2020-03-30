package com.astute.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.astute.ecommerce.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
@Query("select i from Inventory i where  isActive='Y'")
List<Inventory> getAllProducts();
@Modifying
@Query("update Inventory i set i.isActive='N' where i.itemId=:itemId")
int deleteUpdate(@Param("itemId") String itemId);
}
