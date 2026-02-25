import java.util.Scanner;

public class StringStarInserter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		sc.close();
		if (input.length() > 1) {
			for (int i = 0; i < input.length(); i++) {

				if (i == input.length() - 1) {
					System.out.print(input.charAt(input.length() - 1));
				} else {
					System.out.print(input.charAt(i) + "*");
				}
			}
		} else {
			System.out.print(input);
		}
	}

}
