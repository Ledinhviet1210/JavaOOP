

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap name : ");
		String name =sc.nextLine();
		System.out.print("Nhap nam :");
		int year =sc.nextInt();
		int age =2024-year;
		if(age<16) {
			System.out.println("Bạn "+name+"ở độ tuổi vị thành niên");
		}else if(age>=16&&age<18) {
			System.out.println("Bạn" +name+ "ở độ tuổi trưởng thành");
		}else {
			System.out.println("Bạn " +name+ "đã già");
		}
	}
}

