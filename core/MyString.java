package core;
import java.util.* ; 

public class MyString {
	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		int count = 0;
		//neui bo qua ki tu
		if(isIgnoreCase) {
			str = str.toLowerCase();
			ch = Character.toLowerCase(ch); //doi tuong nguyen thuy
		}
		for( int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		
		return count;
	}

	 public static String FormatString(String str) {
		 // loai bo ki tu cach truoc va sau
		 str = str.trim();
		 //loai bo cach thua trong
		 while (str.indexOf("  ") != -1) {
			 str = str.replace("  ", " ");
		 }
		 return str;
	 }
	 public static int coundWord(String str) {
		 // chuan hoa
		 str = MyString.FormatString(str);
		 // dem va tra ve so luong tu
		 
		 return MyString.countChar(str, ' ', false) +1;
	 }
	
	 public static String getWords(String str, byte nWords) {
			str = MyString.FormatString(str);
			// xac dinh vi tride cat
			int i =0;
			int count = 0; // dem ki tu cach
			for(i = 0; i <str.length(); i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
				if(count >= nWords) {
					break;
				}
			}
			
			if(i < str.length() -1) {
				return str.substring(0,i) + "...";
			}else {
				return str;
			}
		}
	 // tim chuoi trong mang so lan xuat hien
	 public static HashMap<String, Integer > statisticWords(String str, String str_split){
		 HashMap<String, Integer> fres = new HashMap<>();
		 str= str.trim();
		 //phan tac hchuoi thanh cacs tu
		 String[] words = str.split(str_split) ;
		 for(String w : words) {
			 if( !w.equalsIgnoreCase("")) {
				 w = w.trim();
				 if( fres.containsKey(w)) {
					 fres.replace(w , fres.get(w)+1);
				 }else {
					 fres.put(w,1);
				 }
			 }
		 }
		 return fres;
	 }
	 public static void printSta(HashMap<String , Integer> fres) {
		 // duyet tap hop va in ra man hinh
		 fres.forEach((k,v) -> {
			 System.out.println(k + "-" + v+ " lan xuat hien");
		 });
	 }
	 
	 public static void main(String []args) {
		 String str = " Cộng   hòa   xã hội chủ   ngĩa  viet nam doc lap tu do ";
		 int count = MyString.coundWord(str);
		 System.out.println(count);
		 System.out.println(MyString.getWords(str, (byte) 4));
		 HashMap<String, Integer> fres= MyString.statisticWords(str, " ");
		 MyString.printSta(fres);
	 }
	 
	 	
}
	 
