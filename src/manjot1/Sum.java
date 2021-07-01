package manjot1;

import java.util.Scanner;

class MyHatt
{
	int a;
	int b;
	int c;
	int sum;
	Scanner s= new Scanner (System.in);
	
	void read()
	{
		System.out.println("Enter the first number");
		a=s.nextInt();
		System.out.println("Enter the second number");
		b=s.nextInt();
		System.out.println("Enter the third number");
		c=s.nextInt();
		
	}
	
	void sum()
	{
		sum =a + b + c;
		System.out.println("total sum is " +sum);
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum);
		
	}
}




public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyHatt m= new MyHatt();
      m.read();
      m.sum();
      m.display();
	}

}
