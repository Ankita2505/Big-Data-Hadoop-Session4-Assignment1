package com.assignments4_1;
//sum () with two parameters and print sum
import java.util.*;//Importing utility package
public class Program3 
{
	//Sum function with 2 parameters
	public static void sum(int first_number,int second_number)
	{

		int total = first_number + second_number;
		System.out.println("First Number is: "+ first_number) ;
		System.out.println("Second Number is: "+ second_number) ;
		System.out.println("Sum is: "+ total) ;

	}

	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);//Creating objects of Scanner class
		//Taking two User inputs for adding two numbers
		System.out.println("Sum of two numbers");
		System.out.println("Enter the first Number --");
		int first_num = sc.nextInt();
		System.out.println("Enter the second Number --");
		int second_num = sc.nextInt();
		sc.close();//Closing Scanner object
		sum(first_num,second_num);//Calling function sum

	}//Close of MAin Class
}
