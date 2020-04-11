package com.codecool.uml.overloading;

import java.util.Currency;

public class Webshop {

    public static void main(String[] args) {
	    Product product1 = new Product();
        Product product2 = new Product("newProduct", 20, Currency.getInstance("EUR"));
        Product product3 = new Product();
        Product product4 = new Product();
//        System.out.println(product1.toString());
//        System.out.println(product2.toString());
//        System.out.println(product3.toString());
//        System.out.println(product4.toString());
//
//
//        System.out.println();
        ProductCategory category1 = new ProductCategory();
        ProductCategory category2 = new ProductCategory("Grocery", "Grocery department", "grocery");
        ProductCategory category3 = new ProductCategory();
        ProductCategory category4 = new ProductCategory();
        ProductCategory category5 = new ProductCategory();
//        System.out.println(category1.toString());
//        System.out.println(category2.toString());
//        System.out.println(category3.toString());
//        System.out.println(category4.toString());
//        System.out.println(category5.toString());

        product1.setProductCategory(category1);
        product2.setProductCategory(category2);
        product3.setProductCategory(category1);
        product4.setProductCategory(category2);

//        System.out.println();
        FeaturedProductCategory featuredProductCategory1 = new FeaturedProductCategory();
        FeaturedProductCategory featuredProductCategory2 = new FeaturedProductCategory();
        System.out.println(featuredProductCategory1.toString());
        System.out.println(featuredProductCategory2.toString());

//        System.out.println();
        Supplier supplier1 = new Supplier();
        Supplier supplier2 = new Supplier("apanova", "water supplier");
        Supplier supplier3 = new Supplier();
        Supplier supplier4 = new Supplier("petrom", "gas supplier");
//        System.out.println(supplier1);
//        System.out.println(supplier2);
//        System.out.println(supplier3);
//        System.out.println(supplier4);

        product1.setSupplier(supplier1);
        product2.setSupplier(supplier2);
        product3.setSupplier(supplier1);
        product4.setSupplier(supplier4);

        System.out.println();
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        warehouse.addProduct(product3);
        warehouse.addProduct(product4);

        System.out.println("All products:");
        for (Product product: warehouse.getProducts()){
            System.out.println(product);
        }

        System.out.println();
        System.out.println("Products by product category:");
       for (Product product: warehouse.getAllProductsBy(category1)){
           System.out.println(product);
       }

        System.out.println();
        System.out.println("Products by supplier:");
        for (Product product: warehouse.getAllProductsBy(supplier1)){
            System.out.println(product);
        }

//        System.out.println("=============S");????????????
//        for (Product product: category1.getProducts(warehouse)){
//            System.out.println(product);
//        }

    }
}
