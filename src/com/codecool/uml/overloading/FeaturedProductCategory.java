package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate){

    }

    @Override
    public String toString() {
        System.out.println("FeaturedProductCategory:");
        return super.toString();
    }
}
