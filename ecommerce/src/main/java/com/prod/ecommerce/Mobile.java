package com.prod.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;

public class Mobile implements Product {
    private String brandName;
    private String price;
    private String topPrice;
    @Autowired
    public void setbrandName(String name){
        this.brandName=name;
    }
    public void setprice(String price){
        this.price=price;
    }
    public void settopPrice(String topPrice){
        this.topPrice=topPrice;
    }

    public void Product_details(){
        System.out.println("the brand is "+this.brandName);
    }
    public void price_details(){

        System.out.println("the price of the "+ this.brandName+" mobile is "+this.topPrice);
       
    }
    public void getTopPriceOfProduct() {
        System.out.println("the top most price of the "+this.brandName+ " is "+this.price);
        System.out.println("-----------------------------------------------");
    }
    
}


    
