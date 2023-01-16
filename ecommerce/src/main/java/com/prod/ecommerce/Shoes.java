package com.prod.ecommerce;
import org.springframework.stereotype.Component;



    

@Component("ShoeProduct")
public class Shoes implements Product{
    @Override
    public void Product_details(){
        System.out.println("the brand is Adidas");
    }
    @Override
    public void price_details(){

        System.out.println("the price of the Adidas shoe is 4000");
        
    }
    
    

    @Override
    public void getTopPriceOfProduct() {
        System.out.println("the top most price of the adidas is 10,000");
        System.out.println("-----------------------------------------");
    }

}

