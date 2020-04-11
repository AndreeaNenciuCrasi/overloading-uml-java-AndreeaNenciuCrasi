package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory {
    private static int tID=0;
    private int id;
    private String name;
    private String department;
    private String description;

    public ProductCategory() {
        this("default category", "default department", "default description");
    }

    public ProductCategory(String name, String department, String description) {
        tID++;
        this.id = tID;
        this.name = name;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts(Warehouse warehouse){
        return warehouse.getProducts();
    }

    public String toString() {
        return  "id:" + id +
                ", name:'" + name + '\'' +
                ", department:'" + department + '\'' +
                ", description:'" + description + '\'';
    }
}
