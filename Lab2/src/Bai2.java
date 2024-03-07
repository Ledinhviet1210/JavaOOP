

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần ktra =");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Số vừa nhập số chẵn");
		} else {
			System.out.println("Số vừa nhập là số lẻ");
		}
	}
}
