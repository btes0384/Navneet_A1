package project;

public class String5 
{

public static void main(String[] args)
{
	String s="City Beautiful Chandigarh33";
	int vowels=0;
	int constants=0;
	int spaces=0;
	for(int i=0;i< s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			vowels++;
			System.out.println("Vowels are"+vowels);
		}
	

	
	else if(ch >'a' && ch <= 'z')
	{
		constants++;

		System.out.println("constants"+constants);
}
		
			
		 else if (ch ==' ')
	{
	spaces++;

	System.out.println("Spaces are"+spaces);
}
}}
	}