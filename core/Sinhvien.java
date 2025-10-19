package core;
import java.util.Scanner;
public class Sinhvien {
	private String maSV;
	private String ten;
	private int tuoi;
	private double diemTB;
	
	public Sinhvien() {
		
	}
	public String getMaSV() {
		return maSV;
	}
	public Sinhvien(String maSV, String ten, int tuoi, double diemTB) {
		this.maSV= maSV;
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemTB = diemTB;
	}
	public void inThongTin() {
		System.out.print("Mã SV: " + maSV+", ");
		System.out.print("Tên: " +ten+", ");
		System.out.print("Tuổi: "+tuoi+", ");
		System.out.println("Điểm TB: "+diemTB);
	}
	public void capNhatDiem(double diemMoi) {
	 if(10< diemMoi ||diemMoi<0) {
		 
		 System.out.println("Diem moi khong hop le");
	 }else { this.diemTB = diemMoi;
	}
}
	public static void main(String[] args) {
		
		Sinhvien sv1 = new Sinhvien("601547" , "Nguyễn Trọng Thái", 20, 6.6);
		Sinhvien sv2 = new Sinhvien("602531" , "Nguyễn Văn Gay", 19, 8.0);

		
		sv1.inThongTin();
		sv2.inThongTin();
		
		sv1.capNhatDiem(9.0);
		sv1.inThongTin();
		
		sv2.capNhatDiem(20.0);
		sv2.inThongTin();
	}
}
