package javaprac;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {

		int inputNum = 0; // 사용자 숫자 입력
		int num, sum, tens, units; // tens = 십의자리, units = 일의자리
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");

		inputNum = sc.nextInt();

		if (0 <= inputNum && inputNum <= 99) { // 0 ~ 99 까지의 정수 확인

			num = inputNum;

			while (true) {

				cnt++;

				tens = num / 10;  // 10 미만일 때는 10의 자리가 0 

				units = num % 10; 

				sum = tens + units;

				num = (units * 10) + (sum % 10);

				if (num == inputNum) {
					System.out.println(cnt);
					break;
				}
			}
		} else {
			System.out.println("0~99 까지의 정수를 입력하세요.");
		}

	}

}
