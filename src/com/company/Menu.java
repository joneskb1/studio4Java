package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

   private ArrayList<MenuItem> items;
    private Date d1;


    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getD1() {
        System.out.println("The last update was on " + d1);
        return d1;
    }

    public void addItem(MenuItem myItem) {

        items.add(myItem);
        this.d1 = new Date();
    }

    public void deleteItem(MenuItem myItem) {
        items.remove(myItem); this.d1 = new Date();
    }


    public void printItems() {
        for(MenuItem item : items) {
            System.out.println("ITEM:\nPrice is " + item.getPrice());
            System.out.println("Description is " + item.getDescription());
            System.out.println("Category is " + item.getCategory());
            System.out.println("Is it a new item? " + item.isNewItem() + "\n********");

        }
    }

    public void printOneItem(MenuItem item) {
        System.out.println( "ITEM: cost is " + item.getPrice() +" for " + item.getDescription() +" for a " + item.getCategory() +" dish. New? = " + item.isNewItem());
    }

    // long = method
    public void areEqual(MenuItem item1, MenuItem item2) {
        if (item1.getPrice() == item2.getPrice()) {
            System.out.println("they are equal on price");
        } else {
            System.out.println("not equal on price");
        }
        if (item1.getDescription() == item2.getDescription()) {
            System.out.println("they have the same description");
        } else {
            System.out.println("not equal description");
        }
        if (item1.getCategory() == item2.getCategory()) {
            System.out.println("they are in the same category");
        } else {
            System.out.println("not in the same category");
        }
        if (item1.isNewItem() == true && item2.isNewItem() == true) {
            System.out.println("they are both new!");
        } else {
            System.out.println("at least one and/or both are not new");
        }

    }



    public void setD1() {
        this.d1 = new Date();
    }

}
