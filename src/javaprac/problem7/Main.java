package javaprac.problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<Stock> stocks = new ArrayList<Stock>();
		List<RealEstate> realEstates = new ArrayList<RealEstate>();
		
		// �ֽ� ������ �߰�
		stocks.add(new Stock("�Ｚ����",1,200,250,100));
		stocks.add(new Stock("��Ʈ����",2,8,15,5));
		
		
		// �ε��� ������ �߰�
		realEstates.add(new RealEstate("����", "���� ������", 0, 0, 10, 3, 20, 0, 0));
		realEstates.add(new RealEstate("���ǽ���", "���� ���۱�", 100, 0, 2, 0, 30, 0, 0));
		realEstates.add(new RealEstate("����Ʈ", "���� ������", 0, 1, 5, 4, 0, 0, 0));
		realEstates.add(new RealEstate("����", "���� ������", 0, 0, 0, 2, 15, 0, 5));
		realEstates.add(new RealEstate("����", "���� ���α�", 0, 0, 50, 0, 100, 50, 0));
	
		
		// �ֽİ� �ε����� ���� ���� ����
		RichPerson rp1 = new RichPerson(stocks, realEstates);
		
		// rp1�� �ֽ� ����
		for(Stock st : rp1.stockList) {
			System.out.println(st.toString());
		}
		
		
		// rp1�� �ε��� ����
		for (RealEstate re : rp1.realEstateList) {
			System.out.println(re.toString());
		}
		
		
	}
	
}
