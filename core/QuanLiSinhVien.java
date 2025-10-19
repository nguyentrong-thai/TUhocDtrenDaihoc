package core;

public class QuanLiSinhVien {
	//phuong thuc
	private Sinhvien[] danhsachSV;
	private int soluong;
	//Contructor Quanli sv
	public QuanLiSinhVien(){
		danhsachSV = new Sinhvien[10];
		soluong = 0;
	}
	public void themSV(Sinhvien sv) {
		if ( soluong < danhsachSV.length) {
			danhsachSV[soluong] = sv;
			soluong++;
		}else {System.out.println("Danh sach da day!");
	}}
	public Sinhvien timSv(String maSV) {
		for (int i = 0; i<soluong; i++) {
			if(danhsachSV[i].getMaSV().equals(maSV)) {
				return danhsachSV[i];
			}
		} return null;
	}
	public void inDanhSach() {
		for(int i = 0; i < soluong; i++) {
			danhsachSV[i].inThongTin();
		}
	}
	public static void main(String[] args) {
		QuanLiSinhVien ql = new QuanLiSinhVien();
		Sinhvien sv1 = new Sinhvien("601547" , "Nguyễn Trọng Thái", 20, 6.6);
		Sinhvien sv2 = new Sinhvien("602531" , "Nguyễn Văn Gay", 19, 8.0);
		Sinhvien sv3 = new Sinhvien("666666" , "Nguyễn Văn BA", 200, 7.0);
		ql.themSV(sv1);
		ql.themSV(sv2);
		ql.themSV(sv3);
		Sinhvien a = ql.timSv("666666");
		System.out.println("Sinh vien ma 666666 :");
		a.inThongTin();
		System.out.println("In danh sach :");
		ql.inDanhSach();
	}
	}
	