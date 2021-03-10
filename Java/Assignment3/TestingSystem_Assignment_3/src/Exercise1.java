import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
//		question1();
//		question2_3();
		question4();
	}
	
	public static void question1() {
		float Luong1;
		float Luong2;

		Luong1 = (float) 5240.5;
		Luong2 = (float) 10970.055;
		System.out.println("Luong1: " + Luong1 + " ||  Luong2: " + Luong2);

		int Luong1_1 = (int) Luong1;
		int Luong2_1 = (int) Luong2;
		System.out.println("Luong1_1: " + Luong1_1 + " ||  Luong2_1: " + Luong2_1);
	}
	public static void question2_3() {
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		while (a < 10000) {
			a = a * 10;
		}
		System.out.println( a);
		System.out.println( a%100);
	}
	public static void question4() {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = scanner.nextInt();
		do {
			System.out.println("Nhap b = ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Nhap b khac 0 !");
			}
		} while (b == 0);
		scanner.close();
		System.out.println("Thuong la : " + (float) a / (float) b);
	}	
}
