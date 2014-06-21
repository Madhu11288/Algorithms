package bubblesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] numbers = { 4, 2, 8, 1, 6, 3 };
		int[] result = mergesort(numbers);
		for (int l = 0; l < result.length; l++) {

			System.out.println(" " + result[l]);
		}
	}

	private static int[] mergesort(int[] numbers) {
		int size = numbers.length;
		int[] left = new int[size / 2], right = new int[size - left.length], result = new int[size];
		if (size < 2) {
			return numbers;
		}
		int mid = size / 2;
		for (int i = 0; i <= mid - 1; i++) {
			left[i] = numbers[i];

		}
		for (int i = mid; i < size; i++) {
			right[i - mid] = numbers[i];

		}
		left = mergesort(left);
		right = mergesort(right);
		result = merge(left, right, result);
		return result;

	}

	private static int[] merge(int[] left, int[] right, int[] numbers) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				numbers[k] = left[i];
				i++;
			} else {
				numbers[k] = right[j];
				j++;
			}
			k++;

		}
		while (i < left.length) {
			numbers[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			numbers[k] = right[j];
			j++;
			k++;
		}
		return numbers;

	}
}
