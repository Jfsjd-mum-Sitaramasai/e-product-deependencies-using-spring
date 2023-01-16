package com.prod.ecommerce;

public class Watches implements Product 
{
    private String brandName;
    private String price;
    private String topPrice;
    public Watches(String name,String price, String topPrice){
        this.brandName=name;
        this.price=price;
        this.topPrice=topPrice;
        
    }
    public void Product_details(){
        System.out.println("the brand is "+this.brandName);
    }
    public void price_details(){

        System.out.println("the price of the "+ this.brandName+" shirt is "+this.price);
        
    }
    public void getTopPriceOfProduct() {
        System.out.println("the top most price of the "+this.brandName+" is "+this.topPrice);
        System.out.println("-----------------------------------------");
    }
    
}
