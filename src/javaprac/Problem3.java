package javaprac;

import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {
	
    int inputYear;
    String result;
    
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���� �Է� : ");
   
	inputYear = sc.nextInt();
   
	result = ((inputYear % 400) == 0 || ((inputYear % 4) == 0 && (inputYear % 100) != 0)) ? "����" : "���";
	            // 400���� ������ �������ų�  4�� ������ �������鼭 100���� ������ �������� ������ ����
	
	System.out.println(result);
}

}
