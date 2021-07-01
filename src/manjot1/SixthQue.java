package manjot1;

import java.util.HashMap;
import java.util.Random;

public class SixthQue {

	public static void main(String[] args) {
	HashMap hm = new HashMap();
    Random r = new Random();
    
    while(hm.size()<50)
    {
    	hm.put(r.nextInt(100),r.nextInt(100));
    }
   System.out.println(hm);
	}
	
	
}
