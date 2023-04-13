package Baekjoon;

import java.util.Scanner;

public class Baekjoon_2903 {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        
	        int a = 1 + (int)Math.pow(2, n);
	        System.out.println(a * a);
		
	}
}
