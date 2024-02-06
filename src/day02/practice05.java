package day02;

import java.util.Scanner;

public class practice05 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double dou1;
		System.out.print("첫 번째 물건의 무게를 입력 하시오");
		dou1 = input.nextDouble();
		
		double dou2;
		System.out.print("두 번째 물건의 무게를 입력 하시오");
		dou2 = input.nextDouble();
		
		double dou3;
		dou3 = 600 - dou1 - dou2;
		System.out.println("현재 엘리베이터에 허용 무게는 " + dou3 + "kg 입니다.");
		
		
		
		
	}
}
