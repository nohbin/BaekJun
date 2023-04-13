package Baekjoon;

import java.util.Scanner;

public class Baekjoon_9063 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x ;
		int y ;
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = 0;
		int y2 = 0;
		
		for (int i = 0; i < n-1; i++) {
			x= sc.nextInt();
			y= sc.nextInt();
//			x1 = x;
//			x2 =x;
//			y1= y;
//			y2 =y;
			
			if(x1>x) {
				x1=x;
			}else if(x2<x) {
				x2 = x;
			}
			if(y1>y) {
				y1=y;
			}else if(y2<y) {
				y2 = y;
			}
			System.out.println("x1 : " + x1);
			System.out.println("x2 : " + x2);
			System.out.println("y1 : " + y1);
			System.out.println("y2 : " + y2);
		}
		int temp = (x2-x1)*(y2-y1);
		System.out.println(temp);
		
	}
}
