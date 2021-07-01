package manjot1;

import java.util.Scanner;

public class NumberPatter {

	public static void main(String[] args) {
		int i,j, n;
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		n=s.nextInt();
		
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{ 
				System.out.print(+i);
			}
			System.out.println();
		}

	}
}
