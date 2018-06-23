package com.codecool.uml.overriding;

public class Order implements Orderable {
    private static int orderCount = 0;
    private int id;
    private String status;

    public boolean checkout() {
        return true;
    }

    public boolean pay() {
        return true;
    }

    public String getStatus() {
        return status;
    }
}
