package make.exception;

import java.util.Scanner;

public class TestUserDefineException {

	public static void main(String[] args) {
		// 사용자 정의 예외 클래스 테스트
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		 System.out.print("첫번째 정수 : ");
		 int first = sc.nextInt();
		 System.out.print("두번째 정수 : ");
		 int second = sc.nextInt();
		 
		 try {
			System.out.println(first + "/" + second + "=" + (calc.divide(first, second)));
			int result = calc.sum(first, second);
			System.out.println(first + "+" + second + "=" + result);
			} /*
				 * catch (RangeBoundException e) { e.printStackTrace(); }
				 *//*
					 * catch(NotDivideZeroException e) { e.printStackTrace(); }
					 */
		 catch(RangeBoundException | NotDivideZeroException e) {
			 //  형제관계인 예외클래스는 비트or 연산자로 예외클래스를 
			 // 여러 개 명시할 수 있음.
			 e.printStackTrace();
		 }

		 finally {
			System.out.println("계산 종료!");
		}

	}

}
