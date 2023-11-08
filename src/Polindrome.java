
public class Polindrome {

	public static void main(String[] args) {
		int number = 12321;
		if (isPalindrome(number)) {
			System.out.println("The number is paliodorme "+number);
		} else {
			System.out.println("The number is not palindrome "+number);
		}
	}
	public static boolean isPalindrome(int number) {
		int orginalNumber = number;
		int reverseredNumber = 0;
		while (number != 0) {
			int digit = number % 10;
			reverseredNumber = reverseredNumber * 10 + digit;
			number /= 10;
		}
		return orginalNumber == reverseredNumber;
	}
}
