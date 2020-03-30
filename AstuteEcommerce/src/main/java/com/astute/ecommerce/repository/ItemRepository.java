package com.astute.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.astute.ecommerce.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

	static Item saveItem(Item item) {
		return item;
	}
	
	@Query(value="select * from item where item_code=:item_code and isactive='Y'", nativeQuery=true)
	Item geItemByCode(@Param("item_code")String userId);
	@Query(value="select max(item_code) from item", nativeQuery=true)
	String geItemCode();
	@Query(value = "SELECT i FROM Item i where i.isActive='Y'")
	List<Item> getAllItems();
	@Modifying
	@Query("UPDATE Item i SET i.isActive='N' where i.itemId=:itemid")
	int deleteUpdate(@Param("itemid") String itemId);

}
