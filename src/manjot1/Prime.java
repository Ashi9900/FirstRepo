package manjot1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,j,i,k=2;
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		
		
      for(i=1;i<=n;i++)
      {
    	  for(j=1;j<=n;j++)
    	  {
    		  System.out.print( " " +k );
    		  k=k+2;
    	  }
    	  System.out.println();
      }
	}

}
