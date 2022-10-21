package logic.sample;

/**
 * continue 문 : 반복문 내에서만 사용할 수 있다.
 * 구문 형식 : 
 * 		if(조건식){
 * 				continue;	//아래의 내용을 생략하기, 증감식으로 가라는 뜻임
 * 		}
 *   	=> 반복 실행 내용을 중간 생략시킬 때 사용함.
 * 
 * 
 * */

public class ContinueSample {
	//Method
	public void testContinue(int value) {
		//1 ~ 100까지 정수들의 합을 구해서 출력 처리
		// 단 전달받은 value  값의 배수들은 제외함
		//즉, 3을 전달받으면 3의 배수들은 제외한 합계값 출력
		int sum = 0;
		for(int n = 1; n<101; n++) {
			if(n % value == 0) {
				continue;  // 지나가라는 의미
			}
			sum += n;
		}
		System.out.println("1 ~ 100까지 " + value + " 배수를 제외한 정수들의 합계 : " + sum);
	}
}
