package Study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Queue<Integer> q = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		for (int j = N; j > 1; j--) {
			q.poll();
			q.add(q.peek());
			q.poll();
		}
		System.out.print(q.poll());
	}
}
