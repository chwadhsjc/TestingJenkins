package com.practise;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int age=24;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("first we need to check your age to access the content ");
		
		System.out.println("enter age: ");
		
		int age = scan.nextInt();
		
		
		
		if (age<=18)
		{
		System.out.println("pilla nibba");
		}
		
		
		else
			
			if (age>18 & age<=80)
			{
				System.out.println("namasthey munnababu");
			}
		
		
		else
			
		if (age>80)
		{
			System.out.println("rey musal na modda");
		}
		
		
		
		
	}

}
