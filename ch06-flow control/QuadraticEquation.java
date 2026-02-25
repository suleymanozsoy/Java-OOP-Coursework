import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// Calculates the roots of a quadratic equation using the discriminant formula.
		// ax^2+bx+c=0
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first coefficient: ");
		int firstCoefficient = sc.nextInt();
		System.out.println("Enter the second coefficient: ");
		int secondCoefficient = sc.nextInt();
		System.out.println("Enter the literal: ");
		int constant = sc.nextInt();
		sc.close();

		double root1 = ((-secondCoefficient)
				+ Math.sqrt((secondCoefficient * secondCoefficient) - 4 * firstCoefficient * constant))
				/ (2 * firstCoefficient);

		double root2 = ((-secondCoefficient)
				- Math.sqrt((secondCoefficient * secondCoefficient) - 4 * firstCoefficient * constant))
				/ (2 * firstCoefficient);

		System.out.println("First root is: " + root1 + " Second root is: " + root2);
	}

}
