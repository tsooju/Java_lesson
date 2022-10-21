package logic.run;

public class TestRandom {

	public static void main(String[] args) {
		double value = Math.random();
		System.out.println("발생값 : " + value);
		
		
		
		// 1~100사이의 임의의 난수 발생
		//(int)(Math.random() * 100) + 시작값
		int num = (int)(Math.random() * 100) + 1;
		System.out.println("num : " + num);
		
		
		//51 ~ 100사이의 정수 발생
		//(int)(Math.random() * (끝값 - 시작값 + 1) + 시작값)
		int num2 = (int)(value * 50) + 51;
		System.out.println("num2 : " + num2);
	}

}
