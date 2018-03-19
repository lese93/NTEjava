package javaprac;

import java.util.Scanner;

public class Ifpractice {

	public static void main(String[] args) {
		
		
		int value = 0;
		
		
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		value = sc.nextInt();
		
		if (value > 19) {
			System.out.println("담배를 팔았다.");
			System.out.print("초콜릿을 좋아합니까? \n 1.예 2.아니오");	
			value = sc.nextInt();
			 
			if (value == 1) {
			System.out.println("초콜릿을 주었다.");
			} else {
				System.out.println("초콜릿을 안주었다.");
			}
			
		} else if (value > 13) {
		
			System.out.print("아이스크림을 좋아합니까? \n 1.예 2.아니오");	
			value = sc.nextInt();
			 
			if (value == 1) {
			System.out.println("아이스크림을 주었다.");
			} else {
				System.out.println("아이스크림을 안주었다.");
			}
			
			
		} else {
		System.out.print("사탕을 좋아합니까? \n 1.예 2.아니오");	
		 value = sc.nextInt();
		 
		if (value == 1) {
		System.out.println("사탕을 주었다.");
		} else {
			System.out.println("사탕을 안주었다.");
		}
		 
		}
		
		
		
	
	}
}
