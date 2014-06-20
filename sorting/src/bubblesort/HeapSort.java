package bubblesort;

public class HeapSort {

	public static void main(String[] args) {
		int[] numbers = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		heapsort(numbers);

	}

	private static void heapsort(int[] numbers) {
		buildHeap(numbers);
		int heapsize = numbers.length - 1;
		for (int i = heapsize; i >= 0; i--) {
			exchange(numbers, 0, i);
			heapsize--;
			max_heap(numbers, 0, heapsize);

		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
	}

	private static void buildHeap(int[] numbers) {
		int length = numbers.length;
		for (int i = length / 2; i >= 0; i--) {
			max_heap(numbers, i, length);

		}

	}

	private static void max_heap(int[] numbers, int i, int length) {
		int leftChild = 2 * i;
		int rightChild = 2 * i + 1;
		int max = i;
		if (leftChild < length && numbers[leftChild] > numbers[i]) {
			max = leftChild;
		}
		if (rightChild < length && numbers[rightChild] > numbers[max]) {
			max = rightChild;
		}
		if (max != i) {
			exchange(numbers, max, i);
			max_heap(numbers, max, length);
		}

	}

	private static void exchange(int[] numbers, int max, int i) {
		int temp = numbers[max];
		numbers[max] = numbers[i];
		numbers[i] = temp;

	}
}
