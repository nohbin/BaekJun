package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10815 {

	public static int binarySearch(int[] cards, int N, int search) {
		int first = 0;
		int last = N - 1;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (cards[mid] == search) {
				return 1;
			}
			if (cards[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int N = Integer.parseInt(br.readLine());
		int[] cards = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(cards);

		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(cards, N, temp) + " ");
		}
		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();

	}
}
