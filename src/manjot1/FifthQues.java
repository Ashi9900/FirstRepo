package manjot1;

import java.util.HashSet;
import java.util.Iterator;

public class FifthQues {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		
		hs.add("Wednesday");
		hs.add(7);
		hs.add(7);
		hs.add(8.9);
		hs.add("Ashi");
		System.out.println("Before: HashSet contains: "+ hs);
		
		hs.clear();
		
		System.out.println("After: HashSet contains: "+ hs);
		
	}

}
