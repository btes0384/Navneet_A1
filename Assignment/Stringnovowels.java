package project;

import java.util.Scanner;

public class Stringnovowels 
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the string");
	String s1=s.nextLine().toLowerCase();
	String b="";
	/*String s2=s1.replaceAll("[aeiou]", " ");
	{
		System.out.println(s2);*/
	for(int i=0;i<s1.length();i++)
	{
		if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
		{
			b=b+s1.charAt(i);
		}
		
	}
	System.out.println(b);
	
}
}
