package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon_7785 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, String> maps = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();
			maps.put(a, b);
		}
		List<String> keyset = new ArrayList<>(maps.keySet());
		for (String key : keyset) {
			if(maps.get(key).equals("leave")) {
				maps.remove(key);
			}
		}
		List<String> after = new ArrayList<>(maps.keySet());
		Collections.sort(after,Collections.reverseOrder());

		for (String k : after) {
			System.out.println(k);
		}
	}
}
