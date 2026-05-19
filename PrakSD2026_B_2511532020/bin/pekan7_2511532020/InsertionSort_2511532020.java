package pekan7_2511532020;

public class InsertionSort_2511532020 {
	public static void insertionSort_2020(int[] arr_2020) {
		int n = arr_2020.length;
		for (int i = 1; i < n; i++) {
			int key_2020 = arr_2020[i];
			int j = i - 1;
			while (j >= 0 && arr_2020[j] > key_2020) {
				arr_2020[j + 1] = arr_2020[j];
				j--;
			}
			arr_2020[j + 1] = key_2020;
		}
	}
	public static void main(String[] args) {
		int arr_2020[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr_2020.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n; i++) 
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
		insertionSort_2020(arr_2020);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n; i++) 
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
			
		}
		
	}


