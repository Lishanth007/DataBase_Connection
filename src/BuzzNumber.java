public class BuzzNumber {
	public static boolean isBuzzNumber(int number) {
		return (number % 10 == 0) || (number % 7 == 0);
	}
	public static void main(String[] args) {
		int number = 17;
		for (int i = 1; i <=number; i++) {
			if(isBuzzNumber(i)) {
				System.out.println("'"+i+"'"+ "is a BuzzNumber...");
			} else {
				System.out.println("It is not a buzz number...");
			}
		}
	}

}
