package com.company;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        ArrayList<MenuItem> myItems = new ArrayList<>();

        MenuItem myItem = new MenuItem(4.94, "cake", "dessert", true);
        MenuItem myItem2 = new MenuItem(13.94, "pasta", "main", false);
        MenuItem myItem3 = new MenuItem(13.94, "pasta", "main", false);

        myItems.add(myItem);
        myItems.add(myItem2);
        myItems.add(myItem3);
        Menu myMenu = new Menu(myItems);

        myMenu.setD1();
        myMenu.getD1();

        myMenu.printItems();
        myMenu.deleteItem(myItem2);
        myMenu.printItems();

        myItem.changePrice(5.5);
        myMenu.printItems();


        myMenu.printOneItem(myItem);
        myMenu.areEqual(myItem3, myItem2);

        System.out.println(myItem.equals(myItem2));
        System.out.println(myItem2.equals(myItem3));


        System.out.println(myItem.hashCode());
        System.out.println(myItem2.hashCode());
        System.out.println(myItem3.hashCode());



    }
}
