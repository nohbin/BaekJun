package Baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Baekjoon_10814 {
	public static void main(String[] args) {

		List<Map<String, Integer>> lists = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Map<String, Integer> maps = new HashMap<>();
			int age = sc.nextInt();
			String name = sc.next();
			maps.put(name, age);
			lists.add(maps);
		}
		System.out.println(lists);
		
		
		
	}
}
