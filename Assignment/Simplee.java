package project;
public class Simplee
{
	int a=10,b=20;
	
	void hello()
	{
		System.out.println(a+b);
	}
	void xyz()
		{
			System.out.println("inside xyz method");
		}
	public static void main(String[] args)
	{
		Simplee d1=new Simplee();
		d1.hello();
		d1.xyz();
	}
	}


