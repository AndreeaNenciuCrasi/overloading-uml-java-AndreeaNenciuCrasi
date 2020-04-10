package com.codecool.uml.overloading;

import java.util.List;

public class Warehouse {
    private List<Product> productList;

    public void addProduct(Product product){

    }
    public List<Product> getProducts(){
        return productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        return productList;
    }

    public List<Product> getAllProductsBy(Supplier supplier){
        return productList;
    }
}
