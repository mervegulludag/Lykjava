package tr.org.linux.kamp.minmax;
import java.util.Scanner;

public class MinumumFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen aralarına boşluk koyarak üç sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		double result = minimum(number1, number2);
		
		System.out.println("En kucuk sayı: " + result);
		
			
	}
	
	public static double minimum(double x, double y) {
		double minimumValue = x;
		
		if(y < minimumValue)
			minimumValue = y;
		
		return minimumValue;
		
	}
}
