package bubblesort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] numbers = { 4, 2, 8, 7, 6 };
		insertionSort(numbers);
	}

	public static void insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int key = numbers[i];
			int hole = i - 1;
			while (hole>-1 && numbers[hole] > key) {
				numbers[hole + 1] = numbers[hole];
				hole--;
			}
			numbers[hole+1] = key;
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(" " + numbers[i]);
		}
	}

}
