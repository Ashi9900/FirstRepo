package manjot1;

import java.util.Scanner;

public class Cthird {

	public static void main(String[] args) {
      int a=0,b=1,c;
      System.out.println("enter the lenght you want:");
      Scanner s = new Scanner(System.in);
      int n= s.nextInt();
      
       
      System.out.print(a+ " "+b);
      for (int i=1;i<=n;i++)
      {
    	  c=a+b;
    	  System.out.print(" " +c);
    	  a=b;
    	  b=c;
    	  
    			  
      } 
      
	}

}
