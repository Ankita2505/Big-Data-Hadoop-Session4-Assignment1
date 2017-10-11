package com.assignments4_1;
//to show method overloading with method sum
public class Program6 
{
	public static void sum()
	{
		System.out.println("sum method with no parameters");
	}
	
	public static void sum(int x)
	{
		System.out.println("sum method with one parameters");
	}
	public static void sum(int x,int y)
	{
		System.out.println("sum method with two parameters");
	}
	public static void sum(double x)
	{
		System.out.println("sum method with one parameters with double data type");
	}
	public static void main(String[] args)//Start of main Class
	{
		// TODO Auto-generated method stub
		
		sum();//call to no parameter sum()
		sum(1);//call to one parameter sum(x)
		sum(6,7);
		sum(6.0);
	}//Close of main class
}
