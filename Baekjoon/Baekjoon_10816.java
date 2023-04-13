package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10816 {
	public static int lowerBound(int[]a , int k) {
		int lo = 0;
		int hi = a.length;
		
		while (lo < hi) {
			int mid = (lo + hi)/2;
			if(k <= a[mid]) {
				hi = mid;
			}else {
				lo = mid +1;
			}
		}
		return lo;
	}
	public static int upperBound(int[]a , int k) {
		int lo = 0;
		int hi = a.length;
		
		while (lo < hi) {
			int mid = (lo + hi)/2;
			if(k < a[mid]) {
				hi = mid;
			}else {
				lo = mid +1;
			}
		}
		return lo;
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(a);
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(upperBound(a, temp)-lowerBound(a, temp)).append(" ");
		}
		System.out.println(sb);
	}
}
