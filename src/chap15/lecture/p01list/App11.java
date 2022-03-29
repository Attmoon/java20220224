package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11 {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(95, 86));
		list.add(Arrays.asList(83, 92, 96));
		list.add(Arrays.asList(78, 83, 93, 87, 88));
		
		int sum = 0;
		int cnt = 0;
		// 합계(881), 평균(88.1)
		for (List<Integer> row : list) {
			for (Integer score : row) {
				sum += score;
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum /(double)cnt);
	}
}
