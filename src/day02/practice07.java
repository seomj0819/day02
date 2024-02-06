package day02;

import java.util.Scanner;

public class practice07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = null;
		System.out.print("학생 이름 : " + name);
		name = input.next();
		
		int kor = 0;
		System.out.print("국어 점수 : " + kor);
		kor = input.nextInt();
		
		int eng = 0;
		System.out.print("영어 점수 : " + eng);
		eng = input.nextInt();
		
		int math = 0;
		System.out.print("수학 점수 : " + math);
		math = input.nextInt();
		
		int sum = 0;
		sum = kor + eng + math;
		
		int everage = 0;
		everage = sum/3;
		
		System.out.println("===================학생 정보===================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");
		System.out.println(name + kor + eng + math + sum + everage );
		
	}
}
