package com.sjp.scannerproblem;

import java.util.Scanner;

public class Technumber {

	public static void main(String[] args) {
int n,num,fst_half,sec_half ,digits=0,squareOfsum=0;


Scanner sc= new Scanner(System.in);
System.out.println("enter number tp check:= ");

//read from user

n=sc.nextInt();

//assign value of n to num
num=n;

while(num>0) {
	digits++; //increase variable digits by 1
	
	num=num/10; //to reamove last digit of number
}

if(digits%2==0) //check num is even or not
	{
	num=n;
	
	fst_half =num%(int)Math.pow(10, digits/2); //determinre half og num
	
	sec_half=num/(int)Math.pow(10, digits/2);
	
	squareOfsum=(fst_half+sec_half)*(fst_half+sec_half);// cal of square of num
	
	if(n==squareOfsum) {
		System.out.println(n+" is tech number");
	}
	else {
		System.out.println(n+" is not tech num");
	}
}
else {
	System.out.println(n+" is not a tech number");
}

	}

}
