package tr.org.linux.kamp.calculator;
import java.util.Scanner;

public class PrimativeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//ekrandan girdi aldık scanner ile
		boolean ctn = true;		//boolean kullandık
		while (ctn) {      //while içi hep true olur
			System.out.println("Bir sayı giriniz");
			double inputNumber1 = input.nextDouble(); //girdiyi double aldık
			System.out.println("Bir işlem giriniz");
			String inputFunction = input.next();

			double result = 0;
			double inputNumber2 = 0;
			switch (inputFunction) {
			case "+":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();		//ikinci sayıyıda double aldık ve inputNumber2ye attık
				result = inputNumber1 + inputNumber2;
				System.out.println(result);
				break;
			case "-":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 - inputNumber2;
				System.out.println(result);
				break;
			case "*":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 * inputNumber2;
				System.out.println(result);
				break;
			case "/":
				System.out.println("Bir sayı daha giriniz");
				inputNumber2 = input.nextDouble();
				result = inputNumber1 / inputNumber2;
				System.out.println(result);
				break;
			default:
				System.out.println("Lütfen + - * / işlemlerinden birini yapın");

			}

		}

	}
}
