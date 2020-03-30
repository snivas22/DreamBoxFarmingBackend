package com.astute.ecommerce.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astute.ecommerce.model.Item;
import com.astute.ecommerce.model.Purchase;
import com.astute.ecommerce.repository.ItemRepository;
import com.astute.ecommerce.repository.PurchaseRepository;
import com.astute.ecommerce.utility.RandomID;

@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	PurchaseRepository repo;
	@Autowired
	ItemRepository itemRepo;

	@Override
	public List<Purchase> getPurchaseItems(String purchaseId) throws ParseException {
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = inputFormat.parse(purchaseId);
		
		return repo.findAllPurchaseItemsByDate(date);
	}

	public Purchase savePurchaseItems(Purchase purchaseItem) {
		purchaseItem.setPurchaseId(RandomID.getRandomID());
		purchaseItem.setDocumentNo(RandomID.getDocumentNo());
		purchaseItem.setCreated(new Timestamp(new Date().getTime()));
		purchaseItem.setCreatedBy("admin");
		purchaseItem.setUpdated(new Timestamp(new Date().getTime()));
		purchaseItem.setUpdatedBy("admin");
		purchaseItem.setDate(new Date());
		purchaseItem.setItemId(itemRepo.geItemByCode(purchaseItem.getItemCode()).getItemId());
		purchaseItem.setIsActive('Y');
		 String dateString = null;
		   SimpleDateFormat sdfr = new SimpleDateFormat("yyyy-MM-dd");
		   dateString = sdfr.format( purchaseItem.getDate() );
		//System.out.println(purchaseItem.getDate());
		System.out.println(repo.getSequenceNo(purchaseItem.getDate()));
		if(repo.getSequenceNo(purchaseItem.getDate())==null) {
			purchaseItem.setSequenceNumber(1);

		}
		else {
			purchaseItem.setSequenceNumber(Integer.parseInt(repo.getSequenceNo(purchaseItem.getDate()))+1);
		}
		System.out.println(purchaseItem.getSequenceNumber());
		return repo.save(purchaseItem);
	}

	public List<Purchase> getAllPurchaseItems() {

		return repo.findAllItems();
	}

	public Purchase updatePurchaseItems(Purchase purchaseItem) {

		return repo.save(purchaseItem);
	}

	public void deletePurchaseItems(String purchaseId) {
			
		 repo.deleteById(purchaseId);
	}

	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return itemRepo.findAll();
	}

}
