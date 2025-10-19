package core;

public class ChuoiUtil {
	private String chuoiGoc;
	public String getchuoiGoc() {
		return chuoiGoc;
	}
	public ChuoiUtil(String chuoiGoc) {
		this.chuoiGoc = chuoiGoc;
	}
	public String daoNguocChuoi() {
		return new StringBuilder(chuoiGoc).reverse().toString();
	}

	public int demSoTu() {
		//trim() : loai bo khoang trang dau cuoi;
		//split(\\s+") tach ra     hoc sinh" = hoc", sinh" do dai cua chuoi laf leng.th
 		String[] tu = chuoiGoc.trim().split("\\s+") ;
		return tu.length;
	}
	public String chuanHoaChuoi() {
		 // loai bo ki tu cach truoc va sau
		String str = chuoiGoc.trim();
		 //loai bo cach thua a
		 while (str.indexOf("  ") != -1) {
			 str = str.replace("  ", " ");
		 }
		str = str.toLowerCase();
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word : words) {
			if((word.length()) > 0){
			result.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1))
			.append(" ");
		}
			}
 		
		 return result.toString().trim();
	 }


	public static void main (String[] args) {
		ChuoiUtil chuoi = new ChuoiUtil("hello world from java");
		System.out.println("chuoi ban dau la:" + chuoi.getchuoiGoc());
		System.out.println("chuoi sao khi dao la: "+ chuoi.daoNguocChuoi());
		System.out.println("So tu trong chuoi la: " + chuoi.demSoTu());
		System.out.println("Chuoi sau khi chuan hoa la: "+ chuoi.chuanHoaChuoi());
	}
}


