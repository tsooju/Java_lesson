package object.silsub3.controller;

import object.silsub3.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		// main() 에서 구현함
		// 1. 매개변수 있는 생성자를 사용해서 3개의 객체를 생성함
		// 2. 객체가 가진 필드값 출력확인
		
		Product pro = new Product("ssgnote6", "갤럭시노트6", "경기도수원",  960000,  10.0);
		Product pro2 = new Product("lgxnote5", "LG스마트폰5", "경기도평택",  780000,  0.7);
		Product pro3 = new Product("ktnorm3", "KT일반폰3", "서울시강남",  25000,  0.3);

		pro.information();
		pro2.information();
		pro3.information();
		
		// 2단계 
		// 1. 각 객체의 가격을 모두 120만원으로 변경함
		pro.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);
		// 2. 각 객체의 부가세율도 모두 0.5로 수정함
		pro.setTax(0.5);
		pro2.setTax(0.5);
		pro3.setTax(0.5);
		
		// 3. 결과 확인
		pro.information();
		pro2.information();
		pro3.information();
		
	//====================================================
		// 1. 부가세율을 모두 0.05로 수정함
		pro.getTax(0.05);
		pro2.getTax(0.05);
		pro3.getTax(0.05);
		
		// 2. 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제 가격 = 가격 + (가격 * 부가세율);
		int result1 = pro.getPrice() + (int)(pro.getPrice() * pro.getTax());
		int result2 = pro2.getPrice() + (int)(pro2.getPrice() * pro2.getTax());
		int result3 = pro3.getPrice() + (int)(pro3.getPrice() * pro3.getTax());
		
		// 출력 확인
		// 상품명, 부가세 포함 가격:
		System.out.println("상품명 : " + pro.getProductName());
		System.out.println("부가세 포함 가격 : " + result1);
		System.out.println("상품명 : " + pro2.getProductName());
		System.out.println("부가세 포함 가격 : " + result2);
		System.out.println("상품명 : " + pro2.getProductName());
		System.out.println("부가세 포함 가격 : " + result2);
		
	} // method end

} // class end
