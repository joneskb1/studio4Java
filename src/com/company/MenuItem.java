package com.company;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }


    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }



    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        MenuItem theItem = (MenuItem) toBeCompared;
        return theItem.getPrice() == getPrice() && theItem.isNewItem() == isNewItem() && theItem.getCategory() == getCategory()
                && theItem.getDescription() == getDescription();
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, newItem);
    }
}

