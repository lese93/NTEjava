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
			System.out.print("점수 입력 :");

			mathScoreList.add(sc.nextInt());

			for (int mScore : mathScoreList) {
				sum += mScore;
			}

			System.out.printf("평균 : %d, 학생 수 : %d \n", sum / mathScoreList.size(), mathScoreList.size());
		}

		// String inputValue = "";
		// String[] mathScores;
		// int sum = 0;
		//
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("점수 입력 ex) 90, 80, 70");
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
		// System.out.println("평균 " + sum / mathScores.length);
		//

	}
}
