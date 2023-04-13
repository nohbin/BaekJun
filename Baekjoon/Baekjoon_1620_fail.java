package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Baekjoon_1620_fail {
	public static boolean isInt(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<Integer, String> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			String s = br.readLine();
			map.put(i, s);
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			String s= br.readLine();
			if(isInt(s)) {
			sb.append(map.get(Integer.parseInt(s))).append("\n"); 
			}else {
				for (Entry<Integer, String> entry : map.entrySet()) {
					if(entry.getValue().equals(s)) {
						sb.append(entry.getKey()).append("\n"); 
					}
				}
			}
		}
		System.out.println(sb);
	}
}
