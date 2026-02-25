import java.util.Scanner;

public class NumberReverser {

	public static void main(String[] args) {
		// This program reverses a given integer by converting it to a String and
		// iterating backwards.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");

		int number = sc.nextInt();

		sc.close();

		String originalString = Integer.toString(number);
		String reversedString = "";
		for (int i = originalString.length() - 1; i >= 0; i--) {

			reversedString += originalString.charAt(i);

		}

		System.out.print(reversedString);

	}

}
