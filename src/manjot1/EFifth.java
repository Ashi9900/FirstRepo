package manjot1;

import java.util.HashMap;

import javax.xml.stream.events.Characters;

public class EFifth {

	public static void main(String[] args) {
		String str = "Swiss";
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
         int lenghofstring = str.length();
         System.out.println(+str.length());
         
         for(int i =0;i<lenghofstring;i++)
         {
        	 Character currentchar = str.charAt(i);
        	 hmap.containsKey(currentchar)
        	 
         }
	}

}
