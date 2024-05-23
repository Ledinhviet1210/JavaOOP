package Lists;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListDemo {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayListDemo() {
        students = new ArrayList<>();
    }

    public void nhapStudent(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            Student student = new Student();
            student.nhapThongTin();
            students.add(student);
        }
    }

    public void xuatStudents() {
        for (Student student : students) {
            student.xuatThongTin();
            System.out.println("-----------");
        }
    }

    // Phương thức thêm mới thông tin một đối tượng Student
    public void themStudent() {
        Student student = new Student();
        student.themThongTin();
        students.add(student);
    }

    // Phương thức sửa thông tin của một đối tượng Student
    public void suaStudent(int index, String newFullName, int newAge) {
        if (index >= 0 && index < students.size()) {
            Student student = students.get(index);
            student.suaThongTin(newFullName, newAge);
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so Student: ");
        int n = sc.nextInt();
        demo.nhapStudent(n);

        System.out.println("Thong tin Student:");
        demo.xuatStudents();

        System.out.println("Them student:");
        demo.themStudent();
        demo.xuatStudents();

        System.out.print("Nhap chi so cua Student can sua: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter new full name: ");
        String newFullName = sc.nextLine();
        System.out.print("Enter new age: ");
        int newAge = sc.nextInt();
        demo.suaStudent(index, newFullName, newAge);

        System.out.println("Updated student information:");
        demo.xuatStudents();
    }
}