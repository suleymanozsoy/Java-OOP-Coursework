import java.util.Scanner;

public class Family {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int babies = 0;
		int youths = 0;
		int seniors = 0;

		System.out.println("Enter the number of your family members: ");

		int memberCount = sc.nextInt();

		int[] ages = new int[memberCount];

		System.out.println("Enter their ages with spaces: ");

		for (int i = 0; i < memberCount; i++) {
			ages[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < ages.length; i++) {
			if (ages[i] > 0 && ages[i] < 3) {
				babies++;
			} else if (ages[i] >= 3 & ages[i] < 60) {
				youths++;
			} else {
				seniors++;
			}
		}

		System.out.println("In this family there are " + babies + " babies, " + youths + " young people, " + seniors
				+ " seniors.");
	}
}
