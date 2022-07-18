package q2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			sb1.append("*");
			sb2.append(sb1).append("\n");
		}
		
		System.out.println(sb2);
	}
}
