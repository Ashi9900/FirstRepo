package manjot1;

import java.util.Scanner;

class Employee
{
	String employeeName;
	float emplyeeSalary;
	String emplyeeCity;
	Scanner s=new Scanner (System.in);
	 void read()
	 {
		 System.out.println("enter the employeeName");
		 employeeName= s.next();
		 System.out.println("enter the emplyeeSalary");
		  emplyeeSalary = s.nextFloat();
		 System.out.println("enter the emplyeeCity");
		 emplyeeCity= s.next();
		 
	 }
	 
	 void display()
	 {
		 System.out.println(employeeName);
		 System.out.println(emplyeeSalary);
		 System.out.println(emplyeeCity);
		 
	 }
}


public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s =new Employee();
		s.display();
		s.read();
		
		

	}

}
