package tr.org.linux.kamp.student;

public class studentApplication {

	public static void main(String[] args) {
		student student1=new student("zakai",80);
		System.out.println(student1.getName()+"'nin harfi="+student1.getLEtterGrade());
	}
}
