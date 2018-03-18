package javaprac;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		int squareCnt = 0;
		int cf1 = 4;
		int cf2 = 6; // circumference 둘레
		int currentCf = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("도형 개수를 입력하세요.");

		squareCnt = sc.nextInt();

		
		if (squareCnt == 1) {
			currentCf = cf1;
		} else if (squareCnt == 2) {
			currentCf = cf2;
		} else {
			
			for (int i = 3; i <= squareCnt; i++) {
				currentCf = cf1 + cf2;
				cf1 = cf2;
				cf2 = currentCf;
			}  // 피보나치 수열 로직과 같다.

		}
		System.out.printf("둘레의 길이는 %d 입니다.", currentCf);

	}

}
