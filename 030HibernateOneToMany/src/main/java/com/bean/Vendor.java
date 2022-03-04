package com.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vendor2")
public class Vendor {

	@Id
	@Column(name = "vendorid",length=10)
	private int vendorId;
	
	private String vendorName;
		
	
	
	@OneToMany(fetch = FetchType.LAZY,
			targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "vendorId", referencedColumnName = "vendorId")
	private Set children;



	public Vendor() {
		super();
	}



	public Vendor(int vendorId, String vendorName, Set children) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.children = children;
	}



	public int getVendorId() {
		return vendorId;
	}



	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}



	public String getVendorName() {
		return vendorName;
	}



	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}



	public Set getChildren() {
		return children;
	}



	public void setChildren(Set children) {
		this.children = children;
	}



	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", children=" + children + "]";
	}
	
	
	
	
	
	
	
}
