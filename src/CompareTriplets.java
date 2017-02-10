import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a0 = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();

		int b0 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();

		int[] alice = { a0, a1, a2 };
		int[] bob = { b0, b1, b2 };
		int score_alice = 0;
		int score_bob = 0;

		for (int i = 0; i < 3; i++) {

			if (alice[i] > bob[i]) {
				score_alice++;
			} else if (bob[i] > alice[i]) {
				score_bob++;
			}

		}

		System.out.println(score_alice + " " + score_bob);

	}

}
