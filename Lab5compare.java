//Comparison of two strings

import java.util.*;
public class Lab5compare { 
	public static void main(String args[]) 
	{ 

      String string1, string2,string3,string4,string5;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter First String");
      string1 = in.nextLine();
 
      System.out.println("Enter Second String");
      string2 = in.nextLine();
		
      System.out.println("Enter Third String");
      string3 = in.nextLine();
 
      System.out.println("Enter Four String");
      string4 = in.nextLine();	

      System.out.println("Enter Five String");
      string5 = in.nextLine();	

		System.out.println("Comparing " + string1 + " and " + string2 
						+ " : " + string1.equals(string2)); 

		
		System.out.println("Comparing " + string3 + " and " + string4 
						+ " : " + string3.equals(string4)); 

		
		System.out.println("Comparing " + string4 + " and " + string5 
						+ " : " + string4.equals(string5)); 

		 
		System.out.println("Comparing " + string1 + " and " + string4 
						+ " : " + string1.equals(string4)); 
	} 
} 