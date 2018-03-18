package javaprac;

import java.util.Scanner;

public class Problem3 {

public static void main(String[] args) {
	
    int inputYear;
    String result;
    
	Scanner sc = new Scanner(System.in);
	
	System.out.print("연도 입력 : ");
   
	inputYear = sc.nextInt();
   
	result = ((inputYear % 400) == 0 || ((inputYear % 4) == 0 && (inputYear % 100) != 0)) ? "윤년" : "평년";
	            // 400으로 나누어 떨어지거나  4로 나누어 떨어지면서 100으로 나누어 떨어지지 않으면 윤년
	
	System.out.println(result);
}

}
