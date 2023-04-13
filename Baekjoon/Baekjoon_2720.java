package Baekjoon;

import java.util.Scanner;

public class Baekjoon_2720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			
			System.out.print((c/25) +" "+ ((c%25)/10) + " "+ ((c%25)%10/5) + " " +(((c%25)%10)%5));
			System.out.println();
			
			
			
		}
		
		
	}
}
