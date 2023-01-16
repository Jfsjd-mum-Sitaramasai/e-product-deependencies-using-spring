package com.prod.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Shirt twills_brand= context.getBean("twills_shirt",Shirt.class);
		twills_brand.Product_details();
		twills_brand.price_details();
		twills_brand.getTopPriceOfProduct();

		Shirt tommy_brand= context.getBean("tommy_shirt",Shirt.class);
		tommy_brand.Product_details();
		tommy_brand.price_details();
		tommy_brand.getTopPriceOfProduct();
		

		Watches fastrack_brand= context.getBean("fastrack_watches",Watches.class);
		fastrack_brand.Product_details();
		fastrack_brand.price_details();
		fastrack_brand.getTopPriceOfProduct();
		
		Watches wrogn_brand= context.getBean("wrogn_watches",Watches.class);
		wrogn_brand.Product_details();
		wrogn_brand.price_details();
		wrogn_brand.getTopPriceOfProduct();

		Shoes main_Product = context.getBean("ShoeProduct", Shoes.class);
		main_Product.Product_details();
		main_Product.price_details();
        main_Product.getTopPriceOfProduct();

		Mobile real_me= context.getBean("Real_me",Mobile.class);
		real_me.Product_details();
		real_me.price_details();
		real_me.getTopPriceOfProduct();



		context.close();

	}

}
