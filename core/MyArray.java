package core;

import java.util.Arrays;

public class MyArray {
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
	
	public static void printArray(int[] arrInt) {
		for(int value : arrInt) {
			System.out.print(value + " ");
			
		}System.out.println();
	}
	public static void printArray(int[][]arrInt) {
		for(int[]row:arrInt) {
			MyArray.printArray(row);
		}
	}
	//timn kiem nhi phan

    public void searchArray(int[] arr, int key) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int index = Arrays.binarySearch(sorted, key);

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(sorted));

        if (index < 0) {
            System.out.println("Không tìm thấy giá trị " + key);
            return;
        }

        System.out.print("Giá trị " + key + " có tồn tại (theo tìm kiếm nhị phân). ");
        System.out.print("Vị trí trong mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) System.out.print(i + " ");
        }
        System.out.println();
    }
    // them phan tu vao mang da xap xep  
    public int[] themPhanTu(int[] arr, int value) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        boolean tang = arr[0] < arr[n - 1]; // true nếu mảng tăng dần

        int i = 0;
        // Tìm vị trí để chèn
        if (tang) {
            while (i < n && arr[i] < value) i++;
        } else {
            while (i < n && arr[i] > value) i++;
        }

        // Sao chép phần trước vị trí chèn
        for (int j = 0; j < i; j++) {
            newArr[j] = arr[j];
        }

        // Chèn phần tử mới
        newArr[i] = value;

        // Sao chép phần sau vị trí chèn
        for (int j = i; j < n; j++) {
            newArr[j + 1] = arr[j];
        }

        return newArr;
    }
	public static void main(String[] args) {
		int[] arrInt = MyArray.generateArray(20);
		MyArray.printArray(arrInt);
		MyArray.sortedArray(arrInt, true);
		MyArray.printArray(arrInt);
		MyArray.sortedArray(arrInt, false);
		MyArray.printArray(arrInt);
		
	}
}
