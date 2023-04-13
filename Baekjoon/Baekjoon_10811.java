package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10811 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[]baguni =new int[n];
			for (int i = 0; i < baguni.length; i++) {
				baguni[i]=i+1;
			}
			for (int i = 0; i < m; i++) {
				int tmp ;
				int a = sc.nextInt()-1;
				int b= sc.nextInt()-1;
				while (a<b) {
					tmp = baguni[a];
					baguni[a++] = baguni[b];
					baguni[b--] = tmp;
				}
			}
			for (int i : baguni) {
				System.out.print(i+" ");
			}
			
		
	}
}
