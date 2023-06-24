package com.jsp.array;

public class Printarray {
	public static int[] reverse(int[] a){
		int[] b=new int [a.length];
		b[0]=a[2];
		b[1]=a[1];
		b[2]=a[0];
        
        printarray1(b);
		return b;

	}
	public static void printarray1(int[] a){
          for(int i=0;i<=a.length-1;i++)
          {
          	System.out.println(a[i]);
          }


	}
	public static void main(String[] args) {
		int[]a1={1,2,3};
		int[] a2={5,11,9};
		int[] a3={7,0,0};
		reverse(a1);
		reverse(a2);
		reverse(a3);
	}
}


