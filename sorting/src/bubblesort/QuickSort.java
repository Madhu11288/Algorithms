package bubblesort;

public class QuickSort {
	static int[] numbers = { 10, 3, 8, 5, 12 };

	public static void main(String[] args) {
		int low = 0, high = numbers.length - 1;

		quicksort(low, high);
	}

	private static void quicksort(int low, int high) {
		int i = low;
		int j = high;
		//Choose the middle number as pivot
		int pivot = numbers[low+(high-low)/2];
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i<=j){
				int temp1 = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp1;
				i++;
				j--;

			}
		}
		if (low < j) {
			quicksort(low, j);
		}
		if (i < high) {
			quicksort(i, high);
		}

		for (int j2 = 0; j2 < numbers.length; j2++) {
			System.out.println(numbers[j2]);

		}

	}

}
