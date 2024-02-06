package day02;

import java.util.Scanner; //특정 기능을 현재 파일로 가져오기

public class Ex06 {
	public static void main(String[] args) {
		//sc (변수이름) = new Scanner(System.in)-> import, 추가가 되어 있어야 함
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		System.out.println("이름 입력 : ");
		name = input.next(); //문자열을 입력 받을때 사용
		
		System.out.print("수 입력 : ");

		num = input.nextInt();

		System.out.println("이름 : "+name);
		System.out.println("입력 수 : "+num);
	
		double dou;
		System.out.println("실수 입력");
		dou = input.nextDouble();
		System.out.println("실수 : "+dou);
	
	
	
	}
}
