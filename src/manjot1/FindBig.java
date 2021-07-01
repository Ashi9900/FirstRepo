package manjot1;

import java.util.Scanner;

class Abby
{
	
	int a,b,c;
	
	Abby()
	{
	 a=0;
     b=0;
     c=0;
	}
	
    Scanner s= new Scanner(System.in);
	void read()
	{
		System.out.println("Please enter the first number ");
		a=s.nextInt();
		System.out.println("Please enter the second number ");
		b=s.nextInt();
		System.out.println("Please enter the third number ");
		c=s.nextInt();
	}
	
	void findBig()
	{
		if (a>b && a>c)
		{
			System.out.println("a is big "+a);
		
		}
		else if(b>c)
		{
			System.out.println("b is big "+b);
		}
		else 
		{
			System.out.println(" is big "+c);
		}
		
	}
	
}



public class FindBig {

	public static void main(String[] args) {
		Abby z = new Abby();
		z.read();
		z.findBig();
	}

}
