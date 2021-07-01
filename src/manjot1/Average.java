package manjot1;

import java.util.Scanner;

class MyKeto
{
	int num1;
	int num2;
	int num3;
	int avg;
	Scanner m = new Scanner (System.in);
	 
	void read()
	{
		System.out.println("enter first number");
		num1=m.nextInt();
		
		System.out.println("enter second number");
		num2=m.nextInt();
		
		System.out.println("enter third number");
		num3=m.nextInt();
		
	}
	
	void avg()
	{
		
		avg=(num1+num2+num3)/3;
		System.out.println("Average of three number is "+avg);
		
	}
	
	void display()
	{
		System.out.println(num1);
		
		System.out.println(num2);
		
		System.out.println(num3);
		System.out.println(avg);
		
		
		
	}

}



public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyKeto s = new MyKeto();
       s.read();
       s.display();
       s.avg();
	}

}
