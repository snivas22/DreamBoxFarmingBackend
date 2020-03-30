package com.astute.ecommerce.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astute.ecommerce.model.Item;
import com.astute.ecommerce.model.Purchase;
import com.astute.ecommerce.service.PurchaseServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/purchase")
public class PurchaseController {
	@Autowired
	PurchaseServiceImpl purchaseServiceImpl;
	@GetMapping("/getPurchaseDetails/{id}")
	public List<Purchase> getPurchaseItemsById(@PathVariable(value = "id") String purchaseId) throws ResourceNotFoundException, ParseException {
		
		return purchaseServiceImpl.getPurchaseItems(purchaseId);
	}
	@GetMapping("/getAllPurchaseDetails")
	public List<Purchase> getAllPurchaseItems() throws ResourceNotFoundException, ParseException {
		
		return purchaseServiceImpl.getAllPurchaseItems();
	}
	@PostMapping(value="/savePurchaseDetails")
	public Purchase savePurchaseItem(@RequestBody Purchase purchaseItem) throws ResourceNotFoundException{
		System.out.println("purchaseItem---->"+purchaseItem);
		return purchaseServiceImpl.savePurchaseItems(purchaseItem);
	}
	@PutMapping("updatePurchaseDetails") 
	public Purchase updatePurchaseItem(@RequestBody Purchase purchaseItem) throws ResourceNotFoundException{
		return purchaseServiceImpl.updatePurchaseItems(purchaseItem);
	}
	@DeleteMapping("deletePurchaseItems/{id}")
	public String deletePurchaseItems(@PathVariable(value="id")String purchaseId) throws ResourceNotFoundException{
		purchaseServiceImpl.deletePurchaseItems(purchaseId);
		return purchaseId+"deleted successfully";
		
	}
	@GetMapping("/getAllItemCodes")
	public List<Item> getAllItemsList() throws ResourceNotFoundException, ParseException {
		return purchaseServiceImpl.getAllItems();
	}
}
