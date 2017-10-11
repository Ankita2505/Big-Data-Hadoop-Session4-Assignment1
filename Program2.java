package com.assignments4_1;
/*
 * take input from user at runtime to perform sum of two numbers 
 * and print the output
 */
import java.util.Scanner;//Scanner Class imported
public class Program2 
{

	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//Creating object of Scanner class
		System.out.println("Enter the first Number");
		int first_num = sc.nextInt();
		System.out.println("Enter the second Number");
		int second_num = sc.nextInt();
		sc.close();
		int sum = first_num + second_num;
		System.out.println("Sum is: "+sum);
	}//Close of Main Class

}
