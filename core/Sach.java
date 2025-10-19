package core;

public class Sach {
	private String maSach;
	private String tieuDe;
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	private int namXuatBan;
	private String[] tacGia;
	public  int soLuong = 0;

	
	public Sach(String maSach, String tieuDe, int namXuatBan) {
		super();
		this.maSach = maSach;
		this.tieuDe = tieuDe;
		this.namXuatBan = namXuatBan;
	    this.tacGia = new String[5];
	}
	public void themTacGia(String name) {
		if(soLuong >= 5) {
			System.out.println("Mang da day");
		}
		else {
			tacGia[soLuong] = name;
			soLuong++;
		}
	}
	public void chuanHoaTieuDe() {
		String str = tieuDe.trim();
		while( str.indexOf("  ") != -1){
			str = str.replace("  ", " ");
	}
		str = str.toLowerCase();
		
		StringBuilder temp = new StringBuilder();
		
		String[] words = str.split(" ");
		for(String word : words) {
			if(word.length() > 0) {
				temp.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		tieuDe = temp.toString().trim();
	}
	public void inThongTin() {
        System.out.print("Ma: " + maSach + ", Tiêu đề: \"" + tieuDe + "\", Năm: " + namXuatBan + ", Tác giả: [");
        for (int i = 0; i < soLuong; i++) {
            System.out.print(tacGia[i]);
            if (i < soLuong-1) System.out.print(", ");
        }
        System.out.println("]");
    }
	public boolean timTacGia(String name) {
		for (int i = 0; i < soLuong; i++) {
            if (tacGia[i].equalsIgnoreCase(name) ) {
            	return true;
            }
        } return false;
	}
	  public String getMaSach() {
	        return maSach;
	    }
}