package manjot1;

public class BSecond {

	public static void main(String[] args) {
		String str= "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
		
		String months[] = str.split("-");
		
		for (int i=0;i<months.length;i++)
		{
			System.out.println(" "+months[i]);
		}
		

	}

}
