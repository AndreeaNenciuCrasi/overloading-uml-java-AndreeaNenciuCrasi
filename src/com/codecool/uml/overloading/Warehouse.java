package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Product> productList = new ArrayList<Product>();

    public void addProduct(Product product){
        this.productList.add(product);
    }
    public List<Product> getProducts(){
        return this.productList;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        List<Product> productsByProductsCategory= new ArrayList<>();
        for (int i=0; i < productList.size(); i++){
            ProductCategory checkedCategory = productList.get(i).getProductCategory();
            if(productCategory.equals(checkedCategory)){
                productsByProductsCategory.add(productList.get(i));
            }
        }
        return productsByProductsCategory;
    }

    public List<Product> getAllProductsBy(Supplier supplier){
        List<Product> productsBySupplier= new ArrayList<>();
        for (int i=0; i < productList.size(); i++){
            Supplier checkedSupplier = productList.get(i).getSupplier();
            if(supplier.equals(checkedSupplier)){
                productsBySupplier.add(productList.get(i));
            }
        }
        return productsBySupplier;
    }
}
