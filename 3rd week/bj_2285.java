
package Study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class bj_2285 {
	static class Village {
		int position; // 마을의 위치
		int population; // 마을의 인구 수

		Village(int position, int population) {
			this.position = position;
			this.population = population;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 마을의 수
		List<Village> villages = new ArrayList<>(); // Village 객체를 저장할 리스트

		// 마을 정보를 입력받아 리스트에 추가
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt(); // 마을 위치
			int a = scanner.nextInt(); // 인구 수
			villages.add(new Village(x, a)); // 새로운 Village 객체를 리스트에 추가
		}

		// 위치를 기준으로 정렬
		Collections.sort(villages, Comparator.comparingInt(v -> v.position));

		// 총 인구 수 계산
		long totalPopulation = 0;
		for (Village village : villages) {
			totalPopulation += village.population;
		}

		long halfPopulation = (totalPopulation + 1) / 2; // 반 인구 계산 (홀수 처리)

		long cumulativePopulation = 0;

		// 우체국 위치 찾기
		for (Village village : villages) {
			cumulativePopulation += village.population;
			if (cumulativePopulation >= halfPopulation) {
				System.out.println(village.position); // 인구의 절반을 초과하는 첫 번째 위치 출력
				break;
			}
		}

		scanner.close();
	}
}
