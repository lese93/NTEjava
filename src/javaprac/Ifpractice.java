package javaprac;

import java.util.Scanner;

public class Ifpractice {

	public static void main(String[] args) {
		
		
		int value = 0;
		
		
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		value = sc.nextInt();
		
		if (value > 19) {
			System.out.println("��踦 �ȾҴ�.");
			System.out.print("���ݸ��� �����մϱ�? \n 1.�� 2.�ƴϿ�");	
			value = sc.nextInt();
			 
			if (value == 1) {
			System.out.println("���ݸ��� �־���.");
			} else {
				System.out.println("���ݸ��� ���־���.");
			}
			
		} else if (value > 13) {
		
			System.out.print("���̽�ũ���� �����մϱ�? \n 1.�� 2.�ƴϿ�");	
			value = sc.nextInt();
			 
			if (value == 1) {
			System.out.println("���̽�ũ���� �־���.");
			} else {
				System.out.println("���̽�ũ���� ���־���.");
			}
			
			
		} else {
		System.out.print("������ �����մϱ�? \n 1.�� 2.�ƴϿ�");	
		 value = sc.nextInt();
		 
		if (value == 1) {
		System.out.println("������ �־���.");
		} else {
			System.out.println("������ ���־���.");
		}
		 
		}
		
		
		
	
	}
}
