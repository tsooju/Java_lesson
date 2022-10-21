package logic.sample;

import java.util.Scanner;

public class IfElseIfSample {
Scanner sc = new Scanner(System.in);
		public void testThreeMax() {
			//3개의 정수를 입력 받아
			//3 수중 가장 큰 값을 알아내서 출력
			System.out.println("first num : ");
			int first = sc.nextInt();
			System.out.println("second num : ");
			int second = sc.nextInt();
			System.out.println("third num : ");
			int third = sc.nextInt();
			
			int max; // 가장 큰 값 저장용 변수
			
			if(first > second && first > third) {
				max = first;
			}else if(second > third) {
				max = second;
			}else {
				max = third;
			}
			
			System.out.println("가장 큰 값 : " + max);
		}
		
		public void testScoreGrade() {
			// 점수를 정수형으로 입력받아
			//단, 반드시 0이상의 값이어야 함. 
			//다중 if 문 사용
			//점수가 90점 이상이면 등급을 'A' 대입
			//점수가 80점 이상 90미만이면 등급을 'B' 대입
			
			//점수가 70점 이상 80미만이면 등급을 'C' 대입
			//점수가 60점 이상 70미만이면 등급을 'D' 대입
			//점수가 60미만이면 등급을 'F' 대입
			//점수와 등급을 출력 처리
			//점수가 0이면 "잘못 입력함" 출력
			
			
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();

			if(num >= 90) {
				System.out.println("등급 : A");
			}else if(num >= 80) {
				System.out.println("등급 : B");
			}else if(num >= 70) {
				System.out.println("등급 : C");
			}else if(num >= 60) {
				System.out.println("등급 : D");
			}else if(num < 60 && num > 0) {
				System.out.println("등급 : F");
			}else if(num <= 0) {
				System.out.println("잘못입력함");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
} // class close
