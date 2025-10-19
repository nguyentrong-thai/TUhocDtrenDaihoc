package core;

public class MyArrays {
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];
		for(int i = 0; i <arrInt.length; i++) {
			arrInt[i] = (int)(Math.random()*100);
		}
		return arrInt;
	}
	//mang 2 chieu
	public static int[][] generateArray(int rows, int cols ){
		int[][ ] arrInt = new int[rows][cols];
		for (int i = 0; i <arrInt.length; i++) {
			arrInt[i] = MyArray.generateArray(cols);	
		}
		return arrInt;
	}
	// xap xep mang co the cho ntang hoac giam dan
	 public static int[] sortedArray(int[] arrInt, boolean isINC) {
		 byte  ori = (byte) (isINC ? 1 : -1);
	
		 for(int i = 0; i < arrInt.length - 1; i++) {
			 for( int j = i+1; j < arrInt.length; j++) {
				 if ((arrInt[i] - arrInt[j]) * ori > 0) {
					 int temp = arrInt[i];
					 arrInt[i] = arrInt[j];
					 arrInt[j] = temp;
				 }
			 }
		 } return arrInt;                               
	 }
	 //so nguyen to
	 public static boolean isPrime(int n) {
		    if (n < 2) return false; // Số nhỏ hơn 2 không phải số nguyên tố

		    for (int i = 2; i <= Math.sqrt(n); i++) {
		        if (n % i == 0) {
		            return false; // Chia hết → không phải số nguyên tố
		        }
		    }
		    return true; // Không chia hết cho số nào → là số nguyên tố
		}
	 public static int[] filterArray(int[] arrInt, boolean isINC) {
		 //thuc hien xap xep
		 arrInt = MyArrays.sortedArray(arrInt, isINC);
		 int[] temp1 = new int[arrInt.length];// lu nguyen to
		 int[] temp2 = new int[arrInt.length];// khong nguyen to
		 int t1 =0, t2=0;
		 for(int value : arrInt) {
			 if(MyArrays.isPrime(value)) {
				 temp1[t1++]= value;
				 
			 }else {
				 temp2[t2++]= value;
			 }
		 }
		 //gop mang
		 for(int i = t1; i <temp1.length; i++) {
			 temp1[i] = temp2[i - t1];
		 }
		 return temp1;
		 
	 }
	
	 public static void main(String[]args) {
		 
	 }
}
