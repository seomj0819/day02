package day02;

import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n1 = 0;
		System.out.print("수 입력 : ");
		n1 = input.nextInt();
		
		String result1;
		result1 = ( n1%2 > 0)?"홀수":"짝수";
		System.out.println(result1);
		
		int n2 = 0;
		System.out.print("수 입력 : ");
		n2 = input.nextInt();
		
		String result2;
		result2 = (n2%3 != 0)? "3의 배수가 아니다":"3의 배수이다";
		System.out.println(result2);
		
		int n3 = 0, n4 = 0;
		System.out.print("num1 : ");
		n3 = input.nextInt();
		System.out.print("num2 : ");
		n4 = input.nextInt();
		
		String result3;
		result3 = (n3>n4)? "num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(result3);
	}
}
