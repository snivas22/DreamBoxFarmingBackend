package com.astute.ecommerce.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astute.ecommerce.model.Item;
import com.astute.ecommerce.repository.InventoryRepository;
import com.astute.ecommerce.repository.ItemRepository;
import com.astute.ecommerce.repository.PurchaseRepository;
import com.astute.ecommerce.utility.RandomID;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemRepository itemRepo;
	@Autowired
	PurchaseRepository purchaseRepo;
	@Autowired
	InventoryRepository inventoryRepo;

	public List<Item> getAllItems() {
		return itemRepo.getAllItems();
	}

	public String getItemCode() {
		return itemRepo.geItemCode();
	}

	public Item updateItems(Item item) {
		return itemRepo.save(item);
	}

	public void deleteItem(String itemId) {
		if (purchaseRepo.findAllItems() != null || !purchaseRepo.findAllItems().isEmpty()) {
			System.out.println(purchaseRepo.findAllItems());
			if (inventoryRepo.getAllProducts() != null || !inventoryRepo.getAllProducts().isEmpty()) {
				System.out.println(inventoryRepo.getAllProducts());
				purchaseRepo.deleteUpdate(itemId);
				inventoryRepo.deleteUpdate(itemId);
				System.out.println(itemRepo.getAllItems());
				itemRepo.deleteUpdate(itemId);
				System.out.println(itemRepo.getAllItems());
			} else {
				System.out.println(purchaseRepo.findAllItems());
				purchaseRepo.deleteUpdate(itemId);
				System.out.println(itemRepo.getAllItems());

				itemRepo.deleteUpdate(itemId);
				System.out.println(itemRepo.getAllItems());

			}

		} else if (inventoryRepo.getAllProducts() != null || !inventoryRepo.getAllProducts().isEmpty()) {
			System.out.println(itemRepo.getAllItems());
			System.out.println(inventoryRepo.getAllProducts());
			inventoryRepo.deleteUpdate(itemId);
			itemRepo.deleteUpdate(itemId);
		} else {
			itemRepo.deleteById(itemId);
		}

	}

	public Item saveItem(Item item) {
		item.setItemId(RandomID.getRandomID());
		item.setDocumentNo(RandomID.getDocumentNo());
		item.setCreated(new Timestamp(new Date().getTime()));
		item.setCreatedBy("admin");
		item.setUpdated(new Timestamp(new Date().getTime()));
		item.setUpdatedby("admin");
		item.setIsActive('Y');

		return itemRepo.save(item);
	}
	/*
	 * @Autowired PurchaseRepository repo;
	 * 
	 * @Autowired ItemRepository itemRepo;
	 * 
	 * @Override public List<Purchase> getPurchaseItems(String purchaseId) throws
	 * ParseException { DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
	 * Date date = inputFormat.parse(purchaseId); return
	 * repo.findAllPurchaseItemsByDate(date); }
	 * 
	 * public Purchase savePurchaseItems(Purchase purchaseItem) {
	 * purchaseItem.setPurchaseId(RandomID.getRandomID());
	 * purchaseItem.setDocumentNo(RandomID.getDocumentNo());
	 * purchaseItem.setCreated(new Timestamp(new Date().getTime()));
	 * purchaseItem.setCreatedBy("admin"); purchaseItem.setUpdated(new Timestamp(new
	 * Date().getTime())); purchaseItem.setUpdatedBy("admin");
	 * purchaseItem.setDate(new Date());
	 * purchaseItem.setItemId(itemRepo.geItemByCode(purchaseItem.getItemCode()).
	 * getItemId()); purchaseItem.setIsActive('Y'); return repo.save(purchaseItem);
	 * }
	 * 
	 * public List<Purchase> getAllPurchaseItems() {
	 * 
	 * return repo.findAll(); }
	 * 
	 * public Purchase updatePurchaseItems(Purchase purchaseItem) {
	 * 
	 * return repo.save(purchaseItem); }
	 * 
	 * public void deletePurchaseItems(String purchaseId) { // TODO Auto-generated
	 * method stub repo.deleteById(purchaseId); }
	 * 
	 * public List<Item> getAllItems() { // TODO Auto-generated method stub return
	 * itemRepo.findAll(); }
	 */
}
