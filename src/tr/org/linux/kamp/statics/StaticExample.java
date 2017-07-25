package tr.org.linux.kamp.statics;

public class StaticExample {
	public static String myStaticString="Bu bir statik string";
	public static String myStaticStringMethod() {
		return "bu bir static metod";
	}
	static {
		System.out.println("1. blok");
	}
	static {
		System.out.println("2. blok");
	}
	static {
		System.out.println("3. blok");
	}
}
