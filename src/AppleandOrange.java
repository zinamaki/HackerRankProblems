import java.util.ArrayList;
import java.util.Scanner;


/* This class solves the apple and orange problem found on HackerRank 
 * link to question: https://www.hackerrank.com/challenges/apple-and-orange 
 */
public class AppleandOrange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int t = sc.nextInt();

		int a = sc.nextInt();
		int b = sc.nextInt();

		int m = sc.nextInt();
		int n = sc.nextInt();

		// next line contains m integers

		ArrayList<Integer> m_values = new ArrayList<Integer>();

		for (int i = 0; i < m; i++) {
			m_values.add(a + sc.nextInt());
		}

		// last line contains n integers

		ArrayList<Integer> n_values = new ArrayList<Integer>();

		for (int j = 0; j < n; j++) {
			n_values.add(b + sc.nextInt());
		}

		int apples_on_Sam = 0;

		// for all of the apples that fell, check if they fell on Sam
		
		for (int apple_fell : m_values) {

			if (apple_fell >= s && apple_fell <= t) {
				apples_on_Sam++;
			}
		}

		System.out.println(apples_on_Sam);

		int oranges_on_Sam = 0;

		// for all of the oranges that fell, check if they fell on Sam
		
		for (int orange_fell : n_values) {

			if (orange_fell >= s && orange_fell <= t) {
				oranges_on_Sam++;
			}
		}

		System.out.println(oranges_on_Sam);

	}

}
