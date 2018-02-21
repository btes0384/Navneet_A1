package project;

public class StudentClassDemo 
{
	
	     int  id;
	     String name;
	     final static String course="java";
	     public static void main(String args[])
	     {
	    	 StudentClassDemo d1=new StudentClassDemo();
	    	 d1.id=1;
	    	 d1.name="abc";
	    			 System.out.println(d1.id);
	    	 System.out.println(d1.name);
	    	 System.out.println(StudentClassDemo.course);
	    	 StudentClassDemo d2=new StudentClassDemo();
	    	 d2.id=2;
	    	 d2.name="aabbcc";
	    			 System.out.println(d2.id);
	    	 System.out.println(d2.name);
	    	 System.out.print(StudentClassDemo.course);
	    	 
	    	 
	    	 
	    	 
	     }
	     
	
}

