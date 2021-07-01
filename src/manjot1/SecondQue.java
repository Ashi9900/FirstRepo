package manjot1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class SecondQue {

	public static void main(String[] args) {
		int p;
	ArrayList ar = new ArrayList();
	Random r =new Random();
	
	for(int i=1;i<=10;i++)
	{
	 ar.add(r.nextInt(100));

	}
	System.out.println(ar);
	System.out.println("printing number in arrays using iterator");
	Iterator itr = ar.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
