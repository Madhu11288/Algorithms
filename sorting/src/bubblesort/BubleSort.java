package bubblesort;

public class BubleSort {
	public static void main(String[] args) {
		int[] numbers = { 4, 1, 8, 6, 7 };
		bubble_sort(numbers);

	}

	private static void bubble_sort(int[] numbers) {
		int temp =0;
		for (int i = 0; i < numbers.length; i++) {
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]>numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					
					numbers[j] = temp;
				}
				
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(" " +numbers[i]);
		}

	}

}
