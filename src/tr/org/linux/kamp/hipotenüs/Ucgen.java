package tr.org.linux.kamp.hipotenüs;
import java.util.Scanner;

public class Ucgen {
	public static double hipotenüs(double a,double b) {
		return Math.hypot(a, b);
		
	}
	public static double alan(double a,double b) {
		return (a*b)/2;
	}
	public static double çevre(double a,double b) {
		double x=hipotenüs(a,b);
		return x+a+b;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("üçgenin a kenarı:");
		double a=input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.println("üçgenin b kenarı:");
		double b=input.nextDouble();
		System.out.println("hipotenüs:"+hipotenüs(a,b));
		System.out.println("alan:"+alan(a,b));
		System.out.println("çevre:"+çevre(a,b));

	}
	
}
