package pekan7_2511532020;

public class SelectionSort_2511532020 {
	public static void selectionSort_2020(int[] arr_2020) {
		int n = arr_2020.length;
		for (int i = 1; i < n; i++) {
			int minIndex_2020 = i;
			for (int j = i + 1; j < n; j++) {
				if (arr_2020[j] < arr_2020[minIndex_2020]) {
					minIndex_2020 = j;
				}
			}
			int temp_2020 = arr_2020[i];
			arr_2020[i] = arr_2020[minIndex_2020];
			arr_2020[minIndex_2020] = temp_2020;
		}
	}
	public static void main(String[] args) {
		int arr_2020[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n = arr_2020.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n; i++)
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
		selectionSort_2020(arr_2020);
		System.out.printf("array yang terurut:\n");
		for (int i = 0; i < n; i++)
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
	}

}
