package examples;


public class ReverseString {
	
	public static void main(String[] args){
		
		int reverse = reverse(1217);
		System.out.println(reverse);
	}

	private static int reverse(int number) {
		int reverseNumber =0;
		int reminder;
		while(number>0){
			reminder = number%10;
			reverseNumber = reverseNumber*10 +reminder;
			number = number/10;
		}
		return reverseNumber;
	}
	

}
