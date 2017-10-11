package com.assignments4_1;
//Sorting in descending order with array
import java.util.Scanner;//Importing Scanner Class
public class Program8 
{
	public static void main(String[] args) //Start of Main Class
	{
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = sc.nextInt();
		int a[] = new int[n];//Declaring array
		System.out.println("Enter elements in the array:");
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		sc.close();//Closing Scanner object
		//Sorting The Elements of Array
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array in Descending Order:");
		for (int i = 0; i < n - 1; i++) 
		{
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n - 1]);
	}//Close of main class

}
