package javaprac;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		
		int starCnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		starCnt = sc.nextInt();
		
		for (int i = 0; i < starCnt; i++) {
			for(int j = 0; j < starCnt; j++) {
				if(i>j) {
				System.out.print(" ");
				} else {
				System.out.print("*");
				}
			
			}
			
			System.out.println("");
		}
		
		
		
		
		
	}
}
