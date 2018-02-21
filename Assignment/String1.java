package project;

public class String1
{
	public static void main(String[] args) {
        int count=0;
        String a="";
        String s="City Chandigarh is Beautiful";
      String s1=new String("CITY CHANDIGARH IS BEAUTIFUL");
        for(int i=0;i<s.length();i++)
        {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')    
        {
            count++;
        }
        }
        System.out.println("Vowels are"+" "+count);
        
		for(int i=s.length()-1; i>=0;i--)
        {
        	a=a+s.charAt(i);
        }
        System.out.print(a);
        
         if(s1.equals(s))
         {
        	 System.out.print("same");
         }
         else
         {
        	 System.out.print("different");
         }
         }
        }
	

