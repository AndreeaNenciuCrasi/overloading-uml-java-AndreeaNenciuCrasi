package com.codecool.uml.overloading;

import java.util.Currency;

public class Product {
    private static int tID=0;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    public Product() {
        this("product", 10, Currency.getInstance("EUR"));
    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        tID++;
        this.id = tID;
        this.name = name;
        this.defaultPrice = defaultPrice;
        this.defaultCurrency = defaultCurrency;
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String toString() {
        return "id:" + id +
                ", name:'" + name + '\'' +
                ", defaultPrice:" + defaultPrice +
                ", defaultCurrency:" + defaultCurrency +
                ", productCategory:" + productCategory +
                ", supplier:" + supplier;
    }
}
