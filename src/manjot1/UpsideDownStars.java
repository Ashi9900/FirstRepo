package manjot1;

import java.util.Scanner;

public class UpsideDownStars {

	public static void main(String[] args) {
		int n,j,i;
		Scanner s= new Scanner(System.in);
	System.out.println("Enter ther number of starts we need it");
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
