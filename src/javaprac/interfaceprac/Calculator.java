package javaprac.interfaceprac;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	List<Child> childList;

	public Calculator(List<Child> childList) {
		this.childList = childList;
	}

	public int getAverage() {
		int sum = 0;

		for (Child ch : childList) {
			sum += ch.getAssets();
		}
		return sum / childList.size();
	}

	public Child getMaxAssetsChild() {
		Child Child = new Child();
		int maxAssets = 0;

		for (Child ch : childList) {
			
			if (maxAssets < ch.getAssets()) {
				maxAssets = ch.getAssets();
				Child = ch;
			}
		}

		return Child;
	}

	public void childListInfo() {
		for (Child ch : childList) {
			System.out.println(ch);
		}
	}

}
