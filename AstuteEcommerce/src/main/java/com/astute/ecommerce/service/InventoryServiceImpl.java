package com.astute.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astute.ecommerce.model.Inventory;
import com.astute.ecommerce.repository.InventoryRepository;
@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
	
	 @Autowired
	    private InventoryRepository repo;
	     
	@Override
	public List<Inventory> getInventoryProducts() {
		return repo.getAllProducts();
	}

}
