package day02;

import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n1 = 0, n2 = 0;
		System.out.print("올해의 년도를 4자리로 입력하세요");
		n1 = input.nextInt();
		
		System.out.print("태어난 년도를 4자리로 입력하세요");
		n2 = input.nextInt();
		int n3;
		n3 = n1-n2;
		System.out.println("당신의 나이는 " + n3 + "살 입니다") ;
	}
}
