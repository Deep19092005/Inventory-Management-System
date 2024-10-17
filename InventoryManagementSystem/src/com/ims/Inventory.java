package com.ims;

public class Inventory {
	
	private int purchaseprice;
	private int saleprice;
	private String name;
	private int quantity;
	

	public Inventory(int purchaseprice, int saleprice, String name, int quantity) {
		this.purchaseprice = purchaseprice;
		this.saleprice = saleprice;
		this.name = name;
		this.quantity = quantity;
	}


	public int getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(int purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [Purchase Price=" + purchaseprice +
				", Sale Price=" + saleprice +
				", Product Name=" + name +
				",Product Quantity="+ quantity+"]";
	}

	
}