
public class ReverseNumber {
	public static int reverseNumber(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;

		}
		return reversed;
	}

	public static void main(String[] args) {
		int number = 987654321;
		int reverseNumber = reverseNumber(number);
		System.out.println("Orginal number: " + number);
		System.out.println("Reversed Number: " + reverseNumber);
	}

}
