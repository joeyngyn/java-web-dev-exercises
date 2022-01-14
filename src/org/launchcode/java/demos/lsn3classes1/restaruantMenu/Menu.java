package org.launchcode.java.demos.lsn3classes1.restaruantMenu;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private Date lastUpdated = new Date();

    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
        lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
