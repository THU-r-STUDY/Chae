package Study;

import java.util.Scanner;

public class greedy {

	static String rev(String Z) {
		StringBuilder rev = new StringBuilder(Z);
		rev.reverse();
		Z = rev.toString();
		return Z;
	}

	public static void main(String[] args) {
		int result = 0;
		Scanner in = new Scanner(System.in);
		String X = in.next();
		String Y = in.next();
		while (X.length() < Y.length()) {
			if (Y.charAt(Y.length() - 1) == 'A') {
				Y = Y.substring(0, Y.length() - 1);
			} else if (Y.charAt(Y.length() - 1) == 'B') {
				Y = Y.substring(0, Y.length() - 1);
				Y = rev(Y);
			}
		}
		if (X.compareTo(Y) == 0)
			result = 1;
		System.out.print(result);
	}
}

