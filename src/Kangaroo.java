import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		boolean possible = false;

		double numerator = x2 - x1;
		double denominator = v1 - v2;

		// if the denominator is 0, you dont want to try division by 0, so
		// return the result immediately

		if (denominator == 0) {
			if (numerator == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			return;
		}

		double calculation = numerator / denominator;

		if (x2 > x1 && v2 >= v1) {
			// in this case, the second kangaroo is ahead of the first, and the
			// first can never catch up since it is slower than the second
			possible = false;
		} else if (x1 > x2 && v1 >= v2) {
			// in this case, the first kangaroo is ahead of the second and the
			// second can never catch up since it is slower than the first
			possible = false;
		} else if (calculation == Math.floor(calculation) && numerator > 0 && denominator > 0 && calculation > 0) {
			// in this case we have calculated the number of jumps in order for
			// them to land on the same spot
			possible = true;
		}

		// display the result

		if (possible) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
