
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a = ");
		int a = scanner.nextInt();
		System.out.println("Nhập b");
		int b = scanner.nextInt();
		int A = a + b;
		System.out.println("Tổng =" + A);
		int B = a - b;
		System.out.println("Hiệu = " + B);
		int C = a * b;
		System.out.println("Tích =" + C);
		double D = a / b;
		System.out.println("Thương " + D);
		float E = a % b;
		System.out.println("Phần dư = " + E);
		if (a > b) {
			System.out.println("a>b");
		} else {
			System.out.println("a<b");
		}
	}
}

