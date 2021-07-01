package manjot1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Colors {

	public static void main(String[] args) {
		ArrayList<String> n =new ArrayList<String>();
		{
			n.add("Red");
			n.add("blue");
			n.add("Pink");
			n.add("Green");
			n.add("Black");
			n.add("Yellow");
			
			ListIterator<String> itr = n.listIterator();
			
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}

	}

}
