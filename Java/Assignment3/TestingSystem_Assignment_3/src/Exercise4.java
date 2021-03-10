import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
//		q1();
//		q2();
//		q3();
//		q4();
		q5();
	}
	public static void q1() {
		String s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi : ");
		s1 = scanner.nextLine();
		String[] words = s1.split(" ");
		System.out.println("So ki tu : " + words.length);
		scanner.close();
	}
	public static void q2() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chuoi 1: ");
		String s1 = scanner.nextLine();
		System.out.println("Nhap chuoi 2: ");
		String s2 = scanner.nextLine();
		System.out.println("Noi chuoi : " + s1.concat(s2));
		
		scanner.close();
	}
	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		System.out.println("Nhap ten : ");
		name = scanner.nextLine();
		String firstCharacter = name.substring(0, 1).toUpperCase();
		String leftCharacter = name.substring(1);
		name = firstCharacter + leftCharacter;
		System.out.println(name);

		scanner.close();
	}
	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		System.out.println("Nhap ten : ");
		name = scanner.nextLine();
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ki tu thu " + (i+1) + " la : " + name.charAt(i));
		}

		scanner.close();
	}
	public static void q5() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ho : ");
		String firstName = scanner.nextLine();
		
		System.out.println("Nhap ten : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Ho va ten : " + firstName + lastName);

		scanner.close();
	}
}
