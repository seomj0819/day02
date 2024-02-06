package day02;

import java.util.Scanner;

public class practice07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("학생 이름 : ");
		name = input.next();
		
		int kor;
		System.out.print("국어 점수 : ");
		kor = input.nextInt();
		
		int eng;
		System.out.print("영어 점수 : ");
		eng = input.nextInt();
		
		int math;
		System.out.print("수학 점수 : ");
		math = input.nextInt();
		
		int sum;
		sum = kor + eng + math;
		
		int everage;
		everage = sum/3;
		
		System.out.println("===================학생 정보===================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------");
		System.out.println(name+ "\t" + kor+ "\t" + eng+ "\t" + math + "\t" + sum  + "\t" + everage );
		
	}
}
