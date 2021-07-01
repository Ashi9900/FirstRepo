package manjot1;

import java.util.HashSet;
import java.util.Iterator;

public class FourthQues {

	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		hs.add("Ashima");
		hs.add(99);
		hs.add(3.2);
		hs.add("Ashima");
		hs.add(99.1);
		hs.add(0.11);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs.size());

	}

}
