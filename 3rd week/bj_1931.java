package Study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class bj_1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] start = new int[N];
		int[] end = new int[N];

		for (int i = 0; i < N; i++) {
			start[i] = in.nextInt();
			end[i] = in.nextInt();
		}
		List<int[]> meetings = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			meetings.add(new int[] { start[i], end[i] });
		}
		meetings.sort(Comparator.comparingInt((int[] meeting) -> meeting[1]).thenComparingInt(meeting -> meeting[0]));
		int cnt = 0;
		int last_end = -1;
		for (int[] meeting : meetings) {
			if (meeting[0] >= last_end) {
				cnt++;
				last_end = meeting[1];
			}
		}
		System.out.print(cnt);
	}
}
