package pekan8_2511532020;

public class QuickSort_2511532020 {
	static void swap_2020(int[] arr, int i, int j)
	{
		int temp_2020 = arr[i];
		arr[i] = arr[j];
		arr[j] = temp_2020;
		
	}
	
	static void medianOfThree_2020(int[] arr, int low, int high)
	{
		int mid = low + (high - low) / 2;
		
		if (arr[low] > arr[mid]) {
			swap_2020(arr, low, mid);
		}
		if (arr[low] > arr[high]) {
			swap_2020(arr, low, high);
		}
		if (arr[mid] > arr[high]) {
			swap_2020(arr, mid, high);
		}
		swap_2020(arr, mid, high);
	}
	static int partition_2020(int[] arr, int low, int high)
	{
		medianOfThree_2020(arr, low, high);
		
		int pivot_2020 = arr[high];
		int i = (low - 1);
		
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot_2020) {
				i++;
				swap_2020(arr, i, j);
			}
		}
		swap_2020(arr, i + 1, high);
		return (i + 1);
	}
	
	static void quickSort_2020(int[] arr, int low, int high)
	{
		if (low < high) {
			int pi_2020 = partition_2020(arr, low, high);
			quickSort_2020(arr, low, pi_2020 - 1);
			quickSort_2020(arr, pi_2020 + 1, high);
		}
	}
	
	public static void printArr_2020(int[] arr)
	{
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int[] arr_2020 = { 10, 7, 8, 9, 1, 5 };
		int N_2020 = arr_2020.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2020(arr_2020);
		
		quickSort_2020(arr_2020, 0, N_2020 - 1);
		
		System.out.print("Data terurut quicksort: ");
		printArr_2020(arr_2020);
	}

}
