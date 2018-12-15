package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
        
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		Category category=new Category();
		category.setCategoryId(1);
		category.setCategoryName("Hyundai Elantra");
		category.setCategoryDesc("Price 13.7L,Mileage 14.59 to 22.5 Km per Litre, Engine 1582 to 1999cc");
		
		categoryDAO.addCategory(category);
}
}
