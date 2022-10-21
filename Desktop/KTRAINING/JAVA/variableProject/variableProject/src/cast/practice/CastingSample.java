package cast.practice;

import java.util.Scanner;

public class CastingSample {
	//실습1
	//키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch + " is unicode : " + (int)ch);
	}
	
	//실습2
	//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 
	//총점과 평균을 계산해서 출력함
	// 총점과 평균은 정수형으로 처리함
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double mat = sc.nextDouble();
		
		int tot = (int)(kor + eng + mat);
		int avg = tot / 3;
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
	}
	
	//실습3
	//정수를 하나 입력받아, 
	//그 정수의 2진수 값에서 비트1의 갯수가 몇개인지를 출력함
	//(힌트 : java.lang.Integer 의 메소드를 찾아서 이용함)
	public void printBitCount() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 2진수에 포함된 비트1의 갯수 : "
				+ Integer.bitCount(num));
	}
}



