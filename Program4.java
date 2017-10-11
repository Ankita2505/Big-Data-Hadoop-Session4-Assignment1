package com.assignments4_1;
import java.util.*;
public class Program4 
{
	public static void main(String[] args)//Start of Main Class
	{
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		//User input for 2 numbers
		System.out.println("Enter the first number");
		int low = sc.nextInt();
		System.out.println("Enter the second number");
		int high = sc.nextInt();
		sc.close();

		for (int i = low; i<=high; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i + " is a even number");
			}
			else
			{
				System.out.println(i + " is a odd number");
			}

		}
	}
}
