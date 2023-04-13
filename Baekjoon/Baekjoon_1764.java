package Baekjoon;

import java.io.*;
import java.util.*;

public class Baekjoon_1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
		
	}
}
