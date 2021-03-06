package com.codecool.uml.overloading;

import java.util.List;

public class Supplier {
    private static int tID=0;
    private int id;
    private String name;
    private String description;

    public Supplier() {
        this("default supplier", "default supplier");
    }

    public Supplier(String name, String description) {
        tID++;
        this.id = tID;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<Product> getProducts(Warehouse warehouse){
//
//    }

    public String toString() {
        return "id:" + id +
                ", name:'" + name + '\'' +
                ", description:'" + description + '\'';
    }
}
