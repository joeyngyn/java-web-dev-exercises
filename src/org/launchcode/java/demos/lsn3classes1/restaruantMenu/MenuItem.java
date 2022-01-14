package org.launchcode.java.demos.lsn3classes1.restaruantMenu;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem (double price, String description, String category, Date dateAdded) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
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


    public boolean isNew() {
        Date currDate = new Date();
        //check if the dates are (3) days apart
        int newTimeMillis = -259200000;
        return currDate.toInstant().plusMillis(-newTimeMillis).isBefore(dateAdded.toInstant());
    }
}
