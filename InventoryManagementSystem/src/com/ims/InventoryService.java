package com.ims;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryService {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Inventory> inventoryList = new ArrayList<>();

    public void addInventory() {
        System.out.print("Enter Product Purchase Price: ");
        int purchasePrice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product Sale Price: ");
        int salePrice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Inventory inventory = new Inventory(purchasePrice, salePrice, name, quantity);
        inventoryList.add(inventory);
        System.out.println("Product added successfully.");
    }

    public void listInventory() {
        if (inventoryList.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Inventory inventory : inventoryList) {
                System.out.println(inventory);
            }
        }
    }

    public void deleteInventory() {
        System.out.print("Enter Product Sale Price to delete: ");
        int salePrice = scanner.nextInt();
        
        Inventory inventory = findInventoryBySalePrice(salePrice);
        if (inventory != null && inventoryList.remove(inventory)) {
            System.out.println("Product record deleted successfully.");
        } else {
            System.out.println("Product record not found or could not be deleted.");
        }
    }

    private Inventory findInventoryBySalePrice(int salePrice) {
        for (Inventory inventory : inventoryList) {
            if (inventory.getSaleprice() == salePrice) {
                return inventory;
            }
        }
        return null;
    }

    public void updateInventory() {
        System.out.print("Enter Product Sale Price to update: ");
        int salePrice = scanner.nextInt();
        scanner.nextLine();

        Inventory inventory = findInventoryBySalePrice(salePrice);
        if (inventory != null) {
            System.out.print("Enter New Purchase Price: ");
            int newPurchasePrice = scanner.nextInt();
            scanner.nextLine();
            inventory.setPurchaseprice(newPurchasePrice);

            System.out.print("Enter New Sale Price: ");
            int newSalePrice = scanner.nextInt();
            scanner.nextLine();
            inventory.setSaleprice(newSalePrice);

            System.out.print("Enter New Name: ");
            String newName = scanner.nextLine();
            inventory.setName(newName);

            System.out.print("Enter New Quantity: ");
            int newQuantity = scanner.nextInt();
            scanner.nextLine();
            inventory.setQuantity(newQuantity);

            System.out.println("Product updated successfully.");
        } else {
        	
            System.out.println("Product not found, update unsuccessful.");
        }
    }
}
