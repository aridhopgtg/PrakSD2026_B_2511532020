package pekan8_2511532020;

public class SheelSort_2511532020 {
	
	public static void shellSort_2020(int[] A_2020) {
		int n_2020 = A_2020.length;
		int gap_2020 = n_2020/2;
		while (gap_2020 > 0) {
			for (int i = gap_2020; i < n_2020; i++) {
				int temp_2020 = A_2020[i];
				int j = i;
				while (j >= gap_2020 && A_2020[j - gap_2020] > temp_2020) {
					A_2020[j] = A_2020[j - gap_2020];
					j = j - gap_2020;
				}
				A_2020[j] = temp_2020;
			}
			gap_2020 = gap_2020/2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_2020 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_2020(data_2020);
		
		shellSort_2020(data_2020);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_2020(data_2020);
	}
	
	public static void printArray_2020(int[] arr) {
		for (int i : arr) System.out.print(i + " ");
		System.out.println();
	}

}
