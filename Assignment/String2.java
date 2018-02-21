package project;

import java.util.Scanner;

public class String2 
{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter a word");
	String s1=s.nextLine();
	String s2="Chandigarh Is Beautiful";
	String s3[]=s2.split(" ");
	boolean flag=false;
	for(int i=0;i<s3.length;i++)

		{
	if(s3[i].equals(s1))
		
			{
		flag=true;
			}
	else
	{
		flag=false;
	}
	}
	if(flag==false)
	{
		System.out.print("found");
	}
	}
}