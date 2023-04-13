package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		Set<String> set2 = new HashSet<>();
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			if (set.contains(temp)) {
				set2.add(temp);
			}
		}
		List<Set<String>> l = Arrays.asList(set2);
		System.out.println(set2.size());
		for (String s : set2) {
			System.out.println(s);
		}

	}
}
