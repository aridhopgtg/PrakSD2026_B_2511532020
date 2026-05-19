package pekan7_2511532020;

public class BubbleSort_2511532020 {
	public static void bubbleSort_2020(int[] arr_2020) {
		int n = arr_2020.length;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if (arr_2020[j] > arr_2020[j + 1]) {
					int temp_2020 = arr_2020[j];
					arr_2020[j] = arr_2020[j + 1];
					arr_2020[j + 1] = temp_2020;
					System.out.println("data:" + arr_2020[j] + " " + arr_2020[j + 1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_2020[] = { 23, 78, 45, 8, 32, 56, 1};
		int n = arr_2020.length;
		System.out.print("array yang belum terurut: ");
		for (int i = 0; i < n; i++) 
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
		bubbleSort_2020(arr_2020);
		System.out.print("array yang terurut menggunakan bubble sort:");
		for (int i = 0; i < n; i++)
			System.out.print(arr_2020[i] + " ");
		System.out.println("");
		
	}

}
