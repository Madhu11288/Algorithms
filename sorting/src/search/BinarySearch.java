package search;

public class BinarySearch {

	private static int mid;

	public static void main(String args[]) {
		int[] numbers = { 1, 4, 6, 7, 8 };
		int key = 7;
		int index = binarySearch(numbers, key);
		System.out.println(index);

	}

	private static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length - 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (numbers[mid] <= key) {
				low = mid + 1;

			} else if (numbers[mid] > key) {
				high = mid - 1;

			}
		}
		return mid;

	}

}
