//6.	Write a program that takes a String through Command Line argument and display the length of
//the string. Also display the string into uppercase and check whether it is a palindrome or not. 
//(Refer Java API Documentation)

import java.util.*;
public class StringLcength {

	public static void main(String[] args) {
		
		String str1=args[0];
		System.out.println("Length of string:"+str1.length());
		System.out.println("Uppercase:"+str1.toUpperCase());
		
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		String str2=sb.toString();
		
		if(str1.equals(str2))
			System.out.println(str1+" is palindrome");
		else
			System.out.println(str1+" is not palindrome");
	}

}