
//sum of 1 to n even numbers

package manjot1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		int i=0;
		int n;
		int sum =0;
		Scanner s= new Scanner(System.in);
        System.out.println("enter the value of n");
         n=s.nextInt();
         
         for (i=1;i<=n;i++)
         {
        	 if (i%2==0);
        	 {
        		 sum = sum + i;
        	 }
       
         }
         System.out.println("sum of eben number is" + sum);
         
	}

}
