package tr.org.linux.kamp.fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		for(int i=1; i < 50; i++) {
			if(i%15==0) {
				System.out.println(i+" için FizzBuzz");
			}
			else if(i%3 == 0) {
				System.out.println(i+" için Fizz");
			}
			else if(i%5==0) {
				System.out.println(i+" için Buzz");
			}
			
		}
	}

}
