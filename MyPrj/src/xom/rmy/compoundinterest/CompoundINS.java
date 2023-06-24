package xom.rmy.compoundinterest;

import java.util.Scanner;

public class CompoundINS {

	public static double isp(double a,double b,double c) {
		double d= a*b*c/100;
		return d;
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
 System.out.println(isp(a,b,c));
	}

}
