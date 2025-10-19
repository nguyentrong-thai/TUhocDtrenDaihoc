package core;
import java.util.Scanner;
public class Lab1bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap do dai canh lap phuong : ");
		double canh = sc.nextDouble();
		System.out.print("The tich lap phương : " + (canh*canh*canh));
	}
}
