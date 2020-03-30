package com.astute.ecommerce.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

	@Id
	@Column(name = "inventory_id",unique = true)
	private String inventoryId;
	@Column(name = "item_id")
	private String  itemId;
	@Column(name = "documentno")
	private String documentNo;
	@Column(name = "isactive")
	private Character isActive;
	@Column(name = "created")
	private Timestamp created;
	@Column(name = "createdby")
	private String createdBy;
	@Column(name = "updated")
	private Timestamp updated;
	@Column(name = "updatedby")
	private String updatedBy;
	@Column(name = "date")
	private Date date;
	@Column(name = "item_code")
	private String itemCode;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "item_type")
	private String itemtype;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "price")
	private String price;
	@Column(name = "total_amount")
	private String total;
	public String getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getDocumentNo() {
		return documentNo;
	}
	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}
	public Character getIsActive() {
		return isActive;
	}
	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getUpdated() {
		return updated;
	}
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
}
