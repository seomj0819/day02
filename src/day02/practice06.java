package day02;

import java.util.Scanner;

public class practice06 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int height;
		System.out.print("키를 입력하세요");
		height = input.nextInt();
		
		double standard;
		standard = (height - 100)*0.9;
		System.out.println("표준 체중은 " + standard + "입니다");
		
		double weight;
		System.out.print("현재 체중을 입력하세요");
		weight = input.nextDouble();
		
		double fat;
		fat = (weight/standard)*100;
		System.out.println("표준 체중은 " + standard + "이고 비만도는 " + fat + "입니다");
		
	}
}
