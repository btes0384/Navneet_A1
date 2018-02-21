package project;

import java.util.Scanner;

public class String3
{
	public static void main(String args[])
	{
		String s=" ";
		String rev=" ";
		int length=s.length();
		Scanner s1=new Scanner(System.in);
		System.out.print("enter a string");
		s=s1.nextLine();
		for( int i=s.length()-1;i>0;i--)
         rev=rev +s.charAt(i);
		if(s.equals(rev))
		{
			System.out.print("String palindrome");
		}
		else
		{
			System.out.print("String is not palindrome");
		}
		}
		
		
	}


