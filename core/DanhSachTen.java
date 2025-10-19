package core;
import java.util.Arrays;
public class DanhSachTen {
	private String[] mangTen;
	private  int soluong;
	public  DanhSachTen() {
		mangTen = new String[20];
		soluong = 0;
	}
	public void themTen(String ten) {
		if(soluong < 10) {
			mangTen[soluong] = ten;
			soluong++;
		}
	}
	public int timTen(String name) {
		
		for(int i = 0; i < soluong; i++) {
			if(mangTen[i] != null && mangTen[i].equalsIgnoreCase(name)) {
				
				return i + 1;
			}
		}
			return -1;
		}
	public void sapXepTangDan() {
		String[] temp = new String[soluong];
		for(int i =0; i < soluong; i++) {
			temp[i] = mangTen[i];
		}
		Arrays.sort(temp, String.CASE_INSENSITIVE_ORDER); // sort không phân biệt hoa thường
        // Sao chép lại vào mảng gốc
        for (int i = 0; i < soluong; i++) {
            mangTen[i] = temp[i];
        }
       
	}
	public void inDanhSach() {
        System.out.print("[");
        for (int i = 0; i < soluong; i++) {
            System.out.print(mangTen[i]);
            if (i < soluong - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	
	 public static void main(String[] args) {
	        DanhSachTen ds = new DanhSachTen();

	        // Thêm tên
	        ds.themTen("Anna");
	        ds.themTen("Zoe");
	        ds.themTen("Bob");
	        ds.themTen("Charlie");
	        ds.themTen("David");

	        System.out.print("Danh sách ban đầu: ");
	        ds.inDanhSach();

	        // Tìm tên
	        String tenCanTim = "Bob";
	        int viTri = ds.timTen(tenCanTim);
	        if (viTri != -1) {
	            System.out.println("Vị trí của \"" + tenCanTim + "\": " + viTri);
	        } else {
	            System.out.println("Không tìm thấy tên \"" + tenCanTim + "\"");
	        }

	        // Sắp xếp và in
	        ds.sapXepTangDan();
	        System.out.print("Danh sách sau khi sắp xếp: ");
	        ds.inDanhSach();
	    }
	}


