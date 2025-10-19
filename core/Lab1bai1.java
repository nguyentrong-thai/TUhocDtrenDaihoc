package core;
import java.util.Scanner;
public class Lab1bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho va ten : ");
		String name  = sc.nextLine();
		System.out.print("Nhap diem trung binh :" );
		double diem = sc.nextDouble();
		System.out.println("Hoc sinh : " + (name) + " "+(diem) + (" diem"));
sc.close();
	}

}
