package com.company;


public class Main {

    public static void main(String[] args) {

        Menu myMenu = new Menu();
        MenuItem myItem = new MenuItem(13.94, "pasta", "main", false);
        myMenu.addItem(myItem);
        MenuItem myItem2 = new MenuItem(12.42, "chicken", "main", true);
        myMenu.addItem(myItem2);

        myMenu.getD1();

        myMenu.deleteItem(myItem2);

        myItem.changePrice(12);

        myMenu.printItems();






    }
}
