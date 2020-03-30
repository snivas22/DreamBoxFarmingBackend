package com.astute.ecommerce.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.astute.ecommerce.model.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, String> {

	@Query(value = "SELECT p FROM Purchase p where p.date=:date and p.isActive='Y'")
	List<Purchase> findAllPurchaseItemsByDate(@Param("date") Date date);
	@Query("select max(p.sequenceNumber) as seqNo from Purchase p where p.date=:date")
	String getSequenceNo(@Param("date") Date date);
	@Query(value = "SELECT p FROM Purchase p where p.isActive='Y'")
	List<Purchase> findAllItems();
    @Modifying
	@Query("UPDATE Purchase p SET p.isActive='N' where p.itemId=:itemid")
	int deleteUpdate(@Param("itemid") String itemId);
}
