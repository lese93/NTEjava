package javaprac.interfaceprac;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Child ch1 = new Child("홍길동", 21, 1, 45000);
		Child ch2 = new Child("김희선", 21, 2, 88000);
		Child ch3 = new Child("미나", 21, 2, 95000);

		List<Child> childList = new ArrayList<Child>();

		childList.add(ch1);
		childList.add(ch2);
		childList.add(ch3);

		Calculator cal = new Calculator(childList);

		cal.childListInfo();

		Child maxAssetsChild = cal.getMaxAssetsChild();
		System.out
				.println("최고자산: " + maxAssetsChild.getName() + ": " + String.format("%,d", maxAssetsChild.getAssets()));

		System.out.println("평균자산: " + String.format("%,d", cal.getAverage()));

	}

}
