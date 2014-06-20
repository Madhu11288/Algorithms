package bubblesort;

public class QuickSort1 {

	public static void main(String args[]) {
		int[] numbers = { 10, 7, 14, 8, 1, 100 };
		int low = 1;
		int high = numbers.length - 1;

		int part = partition(numbers, low, high);
		partition(numbers, low, part-1);
		partition(numbers, part+1, high);
		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}

	private static int partition(int[] numbers, int low, int high) {
		int pivot = numbers[low - 1];
		int i = low;
		int j = high;
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;

			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}
		}
		
		int temp1 = numbers[j];
		numbers[j] = pivot;
		pivot = temp1;
		numbers[low - 1] = pivot;

		return j;

	}

}
