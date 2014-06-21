package examples;

public class ReverseNumber {
	
	public static void main(String[] args){
		
		String test = new String("Madhu");
		String reverse = reverse(test);
		System.out.println(reverse);
	}

	private static String reverse(String test) {
		if(test.length()<2){
			return test;
		}
		return reverse(test.substring(1)) + test.charAt(0);
		
	}

}
