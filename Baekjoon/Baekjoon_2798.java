package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
/*
 * 리스트 숫자 3개 출력
 * 
 */
public class Baekjoon_2798 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int max = 0;
		for (int i = 0; i < list.size()-2; i++) {
			for (int j = i+1; j < list.size()-1; j++) {
				for (int j2 = j+1; j2 < list.size(); j2++) {
					int sum = list.get(i)+list.get(j)+list.get(j2);
					
					if(sum < m) {
						max = Math.max(max, sum);
					}else if(sum == m) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);

	}
}


 
