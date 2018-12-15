package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductTest
{
public static void main(String arg[])
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
	Product product=new Product();
	product.setCategoryId(1);
	product.setProductId(101);
	product.setSupplierId(123);
	product.setProductName("Hyundai Elantra");
	product.setProductDesc("Price 13.7L,Mileage 14.59 to 22.5 Km per Litre, Engine 1582 to 1999cc");
	product.setPrice(1300000);
	product.setStock(5);
	
	productDAO.addProduct(product);
}

}
