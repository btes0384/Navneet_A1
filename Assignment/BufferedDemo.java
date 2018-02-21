package project;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class BufferedDemo
{

	public static void main(String[] args) throws IOException
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		BufferedDemo d1=new BufferedDemo();

		System.out.print("enter your name");
		String name=br.readLine();
		System.out.print("enter your age");
		int age=Integer.parseInt(br.readLine());
	}
		
		
	}

	
