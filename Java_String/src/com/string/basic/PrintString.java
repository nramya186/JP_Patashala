package com.string.basic;

public class PrintString {

	public static void main(String[] args) {
String s="jdk";
String p="compiler";
System.out.println("hi" +s.length()); //for length 

//1 concat
String q=s.concat(p);
System.out.println(q);
System.out.println(p.concat(s));   //concat()

//3. Compare two Strings
System.out.println(s.equals(q));  //equal()

//Escape character in Java Strings
String example = "This is the \"String\" class";     // \befor " or '

//Java Strings are Immutable
//In Java, strings are immutable. This means, once we create a string, we cannot change that string.

//To understand it more deeply, consider an example:

// create a string
String e = "Hello! ";
//Here, we have created a string variable named example. The variable holds the string "Hello! ".

//Now suppose we want to change the string.

// add another string "World"
// to the previous tring example
example = e.concat(" World");
//Here, we are using the concat() method to add another string World to the previous string.

//It looks like we are able to change the value of the previous string. However, this is not true.

//Let's see what has happened here,

//JVM takes the first string "Hello! "
//creates a new string by adding "World" to the first string
//assign the new string "Hello! World" to the example variable
//the first string "Hello! " remains unchanged

//java methods:::___________________________________________

//1 Java String contains()

String a1 = "Java String contains()";
boolean b=a1.contains("Java");  //check wherether present or not  give boolean value
System.out.println("Java String contains() : " + b);

//2 Java String split()
String t = "Java is a fun programming language";
String[] result = t.split(" ");
System.out.println(result); //gives hashcode vlaue 
System.out.print("result = ");
for (String str : result) {
  System.out.print(str + ", ");
}


String p1="hello";
String[] p2=p1.split("");  //split each letter 
for(String e2: p2) {
	System.out.println(e2); // h  e l  l o saparate line
}



//char ch;
for(int i=0;i<=s.length()-1; i++) {
	//ch= s.charAt(i);
	System.out.println(s.charAt(i));  //print single char

}
System.out.println("reveres pring string :");
for(int i=s.length()-1;i>=0; i--) {
	//ch= s.charAt(i);
	System.out.println(s.charAt(i));  //print single char

}





	}

}
