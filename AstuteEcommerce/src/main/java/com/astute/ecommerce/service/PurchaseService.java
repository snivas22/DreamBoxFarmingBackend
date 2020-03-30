package com.astute.ecommerce.service;

import java.text.ParseException;
import java.util.List;

import com.astute.ecommerce.model.Purchase;

public interface PurchaseService {
	List<Purchase> getPurchaseItems(String purchaseId) throws ParseException;

	
}
