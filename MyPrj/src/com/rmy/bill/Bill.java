package com.rmy.bill;

public class Bill {

	public static double bil(double price ,double tip,double tax) {
		return price+ ((tip/100)*price)+((tax/100) *price);
	}
	public static void main(String[] args) {
System.out.println(bil(100,10,5));
	}

}
