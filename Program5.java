package com.assignments4_1;
//
import java.util.*;//Importing utility package
public class Program5 
{
	public static void main(String[] args) //start of main class
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter a number to find first 10  multiples of that number");
		int number = sc.nextInt();//user input for integers
		sc.close();
		//performing multiples of any numbers
		for (int i=1 ; i <= 10; i++)
		{
			
			System.out.println(number + "*" +i + "=" +number*i);
		}

	}
}
