package com.myapp;

import java.util.Scanner;

public class TraingleArea {

	   public void getArea() {
		   
		      Scanner scanner = new Scanner(System.in);

		      System.out.println("Enter the width of the Triangle:");
		      double base = scanner.nextDouble();

		      System.out.println("Enter the height of the Triangle:");
		      double height = scanner.nextDouble();

		      double area = (base* height)/2;
		      System.out.println("Area of Triangle is: " + area);      
		      System.out.println("***************************************");
	   } 
}

