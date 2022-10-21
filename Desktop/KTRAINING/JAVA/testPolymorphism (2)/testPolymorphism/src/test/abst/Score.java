package test.abst;

import java.io.Serializable;

// 인터페이스와 클래스 같이 상속 받을 수 있다. 
public class Score extends SampleSuper 
implements IGrade, ICalc, Serializable {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mod(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char getGrade(int score) {
		// TODO Auto-generated method stub
		return 0;
	}

}
