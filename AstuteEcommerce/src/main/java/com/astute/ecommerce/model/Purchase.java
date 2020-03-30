package com.astute.ecommerce.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	@Id
	@Column(name="purchase_id")
	private String purchaseId;
	@Column(name="item_id")
	private String itemId;
	@Column(name="documentno")
	private String documentNo;
	@Column(name="isactive")
	private Character isActive;
	@Column(name="created")
	private Timestamp created;
	@Column(name="createdby")
	private String createdBy;
	@Column(name="updated")
	private Timestamp updated;
	@Column(name="updatedby")
	private String updatedBy;
	@Column(name="date")
	private Date date;
	@Column(name="item_code")
	private String itemCode;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_type")
	private String itemType;
	@Column(name="quantity")
	private String quantity;
	@Column(name="price")
	private String price;
	@Column(name="total_amount")
	private String totalPrice;
	@Column(name="seq_number")
	private int sequenceNumber;
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String optional) {
		this.itemId = optional;
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
	public void setDate(Date date2) {
		this.date = date2;
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
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
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
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	

}
