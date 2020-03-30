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
import com.astute.ecommerce.service.ItemServiceImpl;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/item")
public class ItemController {
	@Autowired
	ItemServiceImpl itemServiceImpl;
//	@GetMapping("/getPurchaseDetails/{id}")
//	public List<Purchase> getPurchaseItemsById(@PathVariable(value = "id") String purchaseId) throws ResourceNotFoundException, ParseException {
//		
//		return purchaseServiceImpl.getPurchaseItems(purchaseId);
//	}
	@GetMapping("/getAllItemDetails")
	public List<Item> getAllPurchaseItems() throws ResourceNotFoundException, ParseException {
		
		return itemServiceImpl.getAllItems();
	}
	@PostMapping(value="/saveItemDetails")
	public Item saveItem(@RequestBody Item item) throws ResourceNotFoundException{
		return itemServiceImpl.saveItem(item);
	}
	@PutMapping("/updateItemDetails") 
	public Item updateItem(@RequestBody Item item) throws ResourceNotFoundException{
		return itemServiceImpl.updateItems(item);
	}
	@DeleteMapping("/deleteItem/{id}")
	public String deleteItems(@PathVariable(value="id")String itemId) throws ResourceNotFoundException{
		System.out.println();
		itemServiceImpl.deleteItem(itemId);
		return itemId+"deleted successfully";
		
	}
	@GetMapping("/getItemCode")
	public String getMaxItemCode() throws ResourceNotFoundException {
		return itemServiceImpl.getItemCode();
	}
//	@GetMapping("/getAllItemCodes")
//	public List<Item> getAllItemsList() throws ResourceNotFoundException, ParseException {
//		return purchaseServiceImpl.getAllItems();
//	}
}
