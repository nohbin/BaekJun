package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1978 {
	static int count;
	static int[]arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		count = 0;
		int n = Integer.parseInt(br.readLine());
		primeNumber();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(arr[num] !=0) count++;
		}
		System.out.println(count);
		
		

		
				
		
	}
	
	static void primeNumber() {
		arr = new int[1001];
		
		int n = 1000;
		
		for (int i = 2; i < n; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i <=n ; i++) {
			if(arr[i]==0) continue;
			for (int j = i+i; j <=n; j+=i) {
				arr[j]=0;
			}
		}
		
	}
}
