import java.util.ArrayList;
import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The first line contains space-separated integers describing the
		// respective heights of each consecutive lowercase English letter
		// (i.e., ).
		// The second line contains a single word, consisting of lowercase
		// English alphabetic letters.

		Scanner in = new Scanner(System.in);

		ArrayList<Integer> heights = new ArrayList<Integer>(26);

		for (int i = 0; i < 26; i++) {
			heights.add(in.nextInt());
		}

		ArrayList<Character> alphabet = alphabetArray();

		String word = in.next();

		int max_height = 0;

		for (char c : word.toCharArray()) {
			int position = alphabet.indexOf(c);

			if (max_height < heights.get(position)) {
				max_height = heights.get(position);
			}

		}
		
		System.out.println(max_height * word.length());

	}

	private static ArrayList<Character> alphabetArray() {
		// TODO Auto-generated method stub
		ArrayList<Character> alphabet = new ArrayList<Character>();
		
		alphabet.add('a');
		alphabet.add('b');
		alphabet.add('c');
		alphabet.add('d');
		alphabet.add('e');
		alphabet.add('f');
		alphabet.add('g');
		alphabet.add('h');
		alphabet.add('i');
		alphabet.add('j');
		alphabet.add('k');
		alphabet.add('l');
		alphabet.add('m');
		alphabet.add('n');
		alphabet.add('o');
		alphabet.add('p');
		alphabet.add('q');
		alphabet.add('r');
		alphabet.add('s');
		alphabet.add('t');
		alphabet.add('u');
		alphabet.add('v');
		alphabet.add('w');
		alphabet.add('x');
		alphabet.add('y');
		alphabet.add('z');
		
		
		return alphabet;
	}

}
