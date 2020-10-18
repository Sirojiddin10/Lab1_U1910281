package com.company;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String itemNumber, itemDescription;
        int itemQuantity;
        double pricePerItem;
        System.out.println("Please input invoice details");
        System.out.print("Part number: ");
        itemNumber = input.next();
        System.out.print("Part description: ");
        itemDescription = input.next();
        System.out.print("Quantity");
        itemQuantity = input.nextInt();
        System.out.print("Price per item");
        pricePerItem = input.nextDouble();
        Invoice invoice = new Invoice(itemNumber, itemDescription, itemQuantity, pricePerItem);
        System.out.println("Part number: " + invoice.getPartNumber());
        System.out.println("Part description: " + invoice.getPartDescription());
        System.out.println("Quantity" + invoice.getItemQuantity());
        System.out.println("Price per item" + invoice.getPricePerItem());
        System.out.println("Total invoice amount" + invoice.getInvoiceAmount());
    }
}
