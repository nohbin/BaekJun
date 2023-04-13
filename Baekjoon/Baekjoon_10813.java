package Baekjoon;

import java.util.Scanner;

public class Baekjoon_10813 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[]baguni =new int[n];
			
			for (int i = 0; i < baguni.length; i++) {
				baguni[i]=i+1;
			}
			
			for (int i = 0; i < m; i++) {
				int temp;
				int a = sc.nextInt();
				int b= sc.nextInt();
				
				temp =baguni[a-1];
				baguni[a-1] = baguni[b-1];
				baguni[b-1] =temp;
			}
			for (int i : baguni) {
				System.out.print(i+" ");
			}
			
		
	}
}
