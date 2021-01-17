package com.company;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    ArrayList<MenuItem> MenuList = new ArrayList<>();
    Date d1 = new Date();

    public Date getD1() {
        System.out.println("The last update was on " + d1);
        return d1;
    }

    public void addItem(MenuItem myItem) {
        MenuList.add(myItem);
    }

    public void deleteItem(MenuItem myItem) {
        MenuList.remove(myItem);
    }


    public void printItems() {
        for(MenuItem item : MenuList) {
            System.out.println("Price is " + item.getPrice());
            System.out.println("Description is " + item.getDescription());
            System.out.println("Category is " + item.getCategory());
            System.out.println("Is it a new item? " + item.isNewItem());

        }
    }
}
