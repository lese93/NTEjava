package javaprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {

		int inputValue = 0;
		int sum;
		List<Integer> mathScoreList = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			sum = 0;
			System.out.print("���� �Է� :");

			mathScoreList.add(sc.nextInt());

			for (int mScore : mathScoreList) {
				sum += mScore;
			}

			System.out.printf("��� : %d, �л� �� : %d \n", sum / mathScoreList.size(), mathScoreList.size());
		}

		// String inputValue = "";
		// String[] mathScores;
		// int sum = 0;
		//
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("���� �Է� ex) 90, 80, 70");
		//
		//
		// inputValue = sc.nextLine();
		//
		// mathScores = inputValue.replace(" ","").split(",");
		//
		// for (String mScore : mathScores) {
		// sum += Integer.valueOf(mScore);
		//
		// }
		//
		// System.out.println("��� " + sum / mathScores.length);
		//

	}
}
