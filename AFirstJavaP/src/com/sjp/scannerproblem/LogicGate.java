package com.sjp.scannerproblem;

import java.util.Scanner;

//The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

//int OperationsBinaryString(char* str);

//The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

//– A denotes AND operation – B denotes OR operation – C denotes XOR Operation
//You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.
//Note:
//No order of priorities of operations is required
//Length of str is odd
//If str is NULL or None (in case of Python), return -1
public class LogicGate {

	public static int solve(String str ) {
		if(str==null)
			return -1;
		
		
		int res=str.charAt(0) -'0';    //?????????
		
		for(int i=1;i<str.length(); )    //?????????????????
		{
			char prev=str.charAt(i);
			i++;
			if(prev=='A') 
				res=res&(str.charAt(i) -'0');
			else if(prev=='B')
				res=res|(str.charAt(i)-'0');
			else
				res=res^(str.charAt(i)-'0');
			i++;				
		}
		return res;
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();
System.out.println(solve(str));
	}

}
