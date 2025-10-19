package core;

public class ThuVien {
	public Sach[] danhSachSach;
	private int soLuongSach;

    public ThuVien() {
        danhSachSach = new Sach[10]; // tối đa 10 sách
        soLuongSach = 0;
    }

    // Thêm sách
    public void themSach(Sach s) {
        if (soLuongSach < danhSachSach.length) {
            danhSachSach[soLuongSach] = s;
            soLuongSach++;
        } else {
            System.out.println("Thư viện đã đầy sách!");
        }
    }

    // Tìm sách theo mã
    public Sach timSachTheoMa(String ma) {
        for (int i = 0; i < soLuongSach; i++) {
            if (danhSachSach[i].getMaSach().equalsIgnoreCase(ma)) {
                return danhSachSach[i];
            }
        }
        return null;
    }

    // In danh sách sách
    public void inDanhSachSach() {
        System.out.println("Danh sách sách:");
        for (int i = 0; i < soLuongSach; i++) {
            danhSachSach[i].inThongTin();
        }
    }

    // Main thử nghiệm
    public static void main(String[] args) {
        ThuVien tv = new ThuVien();

        // Tạo sách 1
        Sach s1 = new Sach("S001", "java oop basics", 2020);
        s1.themTacGia("Author A");
        s1.themTacGia("Author B");

        // Tạo sách 2
        Sach s2 = new Sach("S002", "advanced python programming", 2019);
        s2.themTacGia("Author C");
        s2.themTacGia("Author D");

        // Tạo sách 3
        Sach s3 = new Sach("S003", "data structures and algorithms", 2021);
        s3.themTacGia("Author E");
        s3.themTacGia("Author F");
        s3.themTacGia("Author G");

        // Thêm sách vào thư viện
        tv.themSach(s1);
        tv.themSach(s2);
        tv.themSach(s3);

        // In danh sách sách ban đầu
        tv.inDanhSachSach();

        // Chuẩn hóa tiêu đề sách S001
        s1.chuanHoaTieuDe();
        System.out.println("Sau chuẩn hóa tiêu đề S001: \"" + s1.getTieuDe() + "\"");

        // Tìm tác giả "Author A" trong S001
        boolean tim = s1.timTacGia("Author A");
        System.out.println("Tìm tác giả \"Author A\" trong S001: " + tim);
    }
}
