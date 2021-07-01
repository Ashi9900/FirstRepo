package manjot1;


class StudentDem

{
	int rollnum;
	String name;
	static String collegename= "NIFT";
	
	StudentDem()
	{
		rollnum =101;
		name="Ashi";
	}
	
	
	
}
public class Const {

	public static void main(String[] args) {
		StudentDem s= new StudentDem();
		System.out.println(s.rollnum);
		System.out.println(s.name);
		System.out.println(StudentDem.collegename);
	}

}
