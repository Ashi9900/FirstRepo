package manjot1;

import java.util.Scanner;

class Multi
{
	int num , mu;
	Scanner s=new Scanner (System.in);
	void read()
	{
		System.out.println("Enter the number for the table");
		num=s.nextInt();	
		
	}
	void logic()
	{
		
		for (mu=1;mu<=10;mu++)
		{
			
			System.out.println(num+"*"+mu+"="+(num*mu));
		}
				
	}
}






public class Table {

	public static void main(String[] args) 
	{
	 Multi m = new Multi();
	 m.read();
	 m.logic();
	 

	}

}
