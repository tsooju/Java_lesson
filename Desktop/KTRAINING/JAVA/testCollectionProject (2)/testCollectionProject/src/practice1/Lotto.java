package practice1;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		lottoDisplay();

	}

	public static void lottoDisplay() {

		TreeSet numbers = new TreeSet();
		Random r = new Random();

		while (true) {
			numbers.add(r.nextInt(45) + 1);
			if (numbers.size() == 6)
				break;
		}

		int[] lottoNumbers = new int[numbers.size()];
		Iterator iter = numbers.iterator();
		int i = 0;
		while (iter.hasNext()) {
			lottoNumbers[i++] = (Integer) iter.next();
			// Integer ==> int : 자동 UnBoxing
		}

		System.out.println("이번주 로또 예상 번호 : ");
		for (i = 0; i < lottoNumbers.length; i++) {
			

		}System.out.println(numbers);

	}

}
