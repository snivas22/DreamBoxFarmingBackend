package com.astute.ecommerce.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item implements Serializable{
	
	@Id
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
	private String updatedby;
	@Column(name="item_code")
	private String itemCode;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_type")
	private String itemType;
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
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
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
	
	

}
