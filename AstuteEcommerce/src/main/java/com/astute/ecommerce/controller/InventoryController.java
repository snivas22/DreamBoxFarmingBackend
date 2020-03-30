package com.astute.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astute.ecommerce.model.Inventory;
import com.astute.ecommerce.service.InventoryServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class InventoryController {
	@Autowired
	private InventoryServiceImpl inventoryService;
	
	@GetMapping(value = "/inventory")
	public List<Inventory> getInventoryItems() {
        return inventoryService.getInventoryProducts();
    }

}
