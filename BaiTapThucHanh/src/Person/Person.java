package Person;

import java.util.Scanner;

public class Person {
     public String fullname ;
        public int age ;
            public void nhapThongTin(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap ten :");
                fullname = sc.nextLine();
                System.out.print("Nhap tuoi :");
                age = sc.nextInt();
            }
            public void xuatThongTin(){
                System.out.println("Ten : "+fullname+" - "+age +"tuoi");
            }
        }
