
public class Exercise3 {
	public static void main(String[] args) {
//		question1();
//		question2();
		question3();
	}
	public static void question1() {
		Integer Luong = 5000;
		System.out.printf("%2.2f", (float) Luong);
	}
	public static void question2() {
		String s = "1234567";
		Integer a = Integer.parseInt(s);
		System.out.println(a);
	}
	public static void question3() {
		Integer a = 1234567;
		int b = a.intValue();
		System.out.println(b);
	}
}
