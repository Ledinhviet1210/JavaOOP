

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = 0;
		int n;
		do {
			System.out.println("Nhập n :");
			n = sc.nextInt();
			S += n;
		} while (S <= 100);
		System.out.println("Tổng là :" + S);

	}
}

