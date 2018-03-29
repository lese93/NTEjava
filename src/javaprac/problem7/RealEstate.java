package javaprac.problem7;

public class RealEstate {

	String type; // �ε��� �з�
	String address; // �ּ�
	int monthlyRent; // ���� - ������
	int rent; // ���� - �����
	int price; // ���� - �����
	int rooms; // ���
	int area; // ���� - �� ����
	int trees; // ���� ��
	int floors; // ����

	public RealEstate() {
	}

	public RealEstate(String type, String address, int monthlyRent, int rent, int price, int rooms, int area, int trees,
			int floors) {

		this.type = type;
		this.address = address;
		this.monthlyRent = monthlyRent;
		this.rent = rent;
		this.price = price;
		this.rooms = rooms;
		this.area = area;
		this.trees = trees;
		this.floors = floors;
	}

	@Override
	public String toString() {

		// �Էµ� ��ü �����͸� ����ϴ� ����, '/'�� ���ø� �Ұ� 
		String str = "�з�: " + type + "/, ����: " + price + "��" + "/, �ּ�: " + address + "/, ���: " + rooms + "��" + "/, ����: "
				+ area + "��" + "/, ���� : " + monthlyRent + "��" + "/, ���� : " + rent + "��" + "/, ��: " + floors + "��"
				+ "/, ������: " + trees + "�׷�";
		
		// ��ü ������(str)���� 0�̰ų� ""�� ���� �ش��ϴ� �����͸� ������ �� ������ ����
		String resultStr = "";
		
		// slash(/)�� �����Ͽ� �迭�� ����
		String[] strTypes = str.split("/");

		// ��ü �����͸� �迭�� ����
		Object[] values = { type, price, address, rooms, area, monthlyRent, rent, floors, trees };

		/* ���� 0�̰ų� ""�� �����ʹ� �ѱ�� ���ǹ��� �����͸� ������ */
		for (int i = 0; i < values.length; i++) {

			if ((values[i] instanceof Integer && (int) values[i] == 0)
					|| values[i].equals("")) {
				continue;
			}
			resultStr += strTypes[i];

		}

		return resultStr;
	}

}
