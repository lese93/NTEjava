package javaprac;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {

		int inputNum = 0; // ����� ���� �Է�
		int num, sum, tens, units; // tens = �����ڸ�, units = �����ڸ�
		int cnt = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");

		inputNum = sc.nextInt();

		if (0 <= inputNum && inputNum <= 99) { // 0 ~ 99 ������ ���� Ȯ��

			num = inputNum;

			while (true) {

				cnt++;

				tens = num / 10;  // 10 �̸��� ���� 10�� �ڸ��� 0 

				units = num % 10; 

				sum = tens + units;

				num = (units * 10) + (sum % 10);

				if (num == inputNum) {
					System.out.println(cnt);
					break;
				}
			}
		} else {
			System.out.println("0~99 ������ ������ �Է��ϼ���.");
		}

	}

}
