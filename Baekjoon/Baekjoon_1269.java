package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon_1269 {
	public static void main(String[] args) throws IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n,m;
		
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			lista.add(Integer.parseInt(br.readLine()));
		}
		
		List<Integer> listb = new ArrayList<>();
		for (int i = 0; i < b; i++) {
			listb.add(Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i)) {
				
			}
		}
		
		
	
	}
}
