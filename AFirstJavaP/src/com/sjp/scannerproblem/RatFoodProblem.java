package com.sjp.scannerproblem;

import java.util.Scanner;

public class RatFoodProblem {
//‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i 
//Note:

//    1   Return -1 if the array is null
//  2    Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// 3   Computed values lie within the integer range.	

	
	
	// r=rat   ,unit food ,n= house number   ,arr food in each house
//Explanation:  Total amount of food required for all rats = r * unit
//7 * 2 = 14.


	public static int solve(int r,int unit,int arr[],int n) 
	{
		if (arr==null)  //1
			return -1;
		
		int res =r*unit;   //no of rat * each rat need unit of food
		int sum=0;
		int count =0;
		
		
		for(int i=0;i<n; i++) {
			
			sum=sum+arr[i];
			count++;
			
			if(sum>=res)
			break;
		}
		
		if(sum<res)   // if food  not sufficient for rat
		   return 0;
		return count;
		
	}
	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of rats : ");
		int r= sc.nextInt();
		System.out.println("eneter num of unit require for each rat : ");
		int unit=sc.nextInt();
		System.out.println("enter  num of houses : ");
		int n=sc.nextInt();
		System.out.println("eneter num of  food in each house : ");
		int[] arr= new int[n];
		
//		int r=7;
//		int unit=2;
//		int n=8;
//		int[]arr= {2,8,3,5,7,4,1,2};
		
		
		
		// adding input array
		
		for(int i=0;i<n;i++) 
		{
			System.out.println("enter your " +(i+1)+" enlement : ");
			arr[i]=sc.nextInt();
			System.out.println(" ");

			System.out.println(" your "+ (i+1) +"th element " +arr[i]);
			System.out.println(" ");


//			System.out.print(arr[i]);
//			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("first "+ solve(r,unit,arr,n)+" house is sufficient for all the rats " );
	}

}
