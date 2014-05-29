package bubblesort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numbers = { 4, 2, 8, 7, 1, 6 };
		selectionSort(numbers);
	}

	private static void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[minimum]) {
					minimum = j;
				}

			}
			int temp = numbers[i];
			numbers[i] = numbers[minimum];
			numbers[minimum] = temp;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" " + numbers[i]);
		}

	}
}
