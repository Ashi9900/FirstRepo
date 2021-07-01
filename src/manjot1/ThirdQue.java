package manjot1;

import java.util.HashSet;
import java.util.Iterator;

public class ThirdQue {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(8);
		hs.add(3.5);
		hs.add("Ashi");
		hs.add("Alberta");
		hs.add(101);
		hs.add("alberta");
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
	}

}
