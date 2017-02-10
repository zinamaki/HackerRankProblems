import java.util.Random;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();

		// place the five elements into an array
		
		long[] nums = { a, b, c, d, e };

		// now quicksort the array

		quickSort(nums, 0, 4);

		// since the array is now sorted, the first four elements will sum to the min value
		
		long min = nums[0] + nums[1] + nums[2] + nums[3];
		
		// since the array is now sorted, the last four elements will sum to the max value
		
		long max = nums[1] + nums[2] + nums[3] + nums[4];
		
		// print out the min and max values separated by a space
		
		System.out.println("" + min + " " + max);

	}

	private static int partition(long[] nums, int p, int r) {

		long x = nums[r]; // select a pivot
		int i = p - 1;

		for (int j = p; j <= r - 1; j++) {
			
			if (nums[j] <= x) {
				i = i + 1;
				exchange(nums, i, j);
			}

		}
		exchange(nums, i + 1, r);

		return i + 1;

	}

	private static void quickSort(long[] nums, int p, int r) {
		if (p < r) {
			int q = partition(nums, p, r);
			quickSort(nums, p, q - 1);
			quickSort(nums, q + 1, r);
		}
	}

	private static void exchange(long[] nums, int i, int j) {
		// TODO Auto-generated method stub

		long i_value = nums[i];
		long j_value = nums[j];

		nums[j] = i_value;
		nums[i] = j_value;

	}

}
