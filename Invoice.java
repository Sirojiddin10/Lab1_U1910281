package com.company;

public class Invoice {
    private final String partNumber;
    private final String partDescription;
    private final int itemQuantity;
    private final double pricePerItem;

    public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getItemQuantity() {
        if (itemQuantity < 0) {
            return 0;
        } else {
            return itemQuantity;
        }
    }

    public double getPricePerItem() {
        if (pricePerItem < 0) {
            return 0.0;
        } else {
            return pricePerItem;
        }
    }

    public double getInvoiceAmount() {
        return itemQuantity * pricePerItem;
    }
}
