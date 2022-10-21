package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	private Scanner sc = new Scanner(System.in);
	public void selectMenu(){
	 
		
		String orderlist = null;  // 주문리스트
		int count = 0; // 주문갯수
		int total_price = 0; // 총 가격
		String menuName = ""; // 메뉴 목록
		int menuPrice = 0; // 가격
		total_price += menuPrice; // 총 금액 추가 
		orderlist += menuName; // 총 주문 리스트
		count++; // 갯수 추가
		while(true) {
			System.out.print("*** 메뉴를 선택하세요 ***\n");
			System.out.println();
			System.out.println("햄버거 ***************");
			System.out.println("1. 불고기버거 3500원");
			System.out.println("2. 치킨버거 3200원");
			System.out.println("추가 ****************");
			System.out.println("3. 감자튀김 1000원");
			System.out.println("4. 치즈스틱 400원");
			System.out.println("5. 샐러드 2000원");
			System.out.println("음료수 ***************");
			System.out.println("6. 콜라	700원");
			System.out.println("7. 에이드 1200원");
			System.out.println("8. 커피 1000원");
			System.out.println("********************");
			System.out.println();
			System.out.print("번호 선택 : ");
			
			int no = sc.nextInt();

			if(no == 1) {
				menuName = "불고기버거";
				menuPrice = 3500;
				
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("주문 갯수를 선택하세요 : ");
				count = sc.nextInt();
				count++;	
				orderlist = ("총" + menuName + " : " + (menuPrice * count) + "원입니다");
				System.out.println(orderlist);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
				break;
				}
	
				
			}else if(no == 2) {
				menuName = "치킨버거";
				menuPrice = 3200;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else if(no == 3) {
				menuName = "감자튀김";
				menuPrice = 1000;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else if(no == 4) {
				menuName = "치즈스틱";
				menuPrice = 400;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else if(no == 5) {
				menuName = "샐러드";
				menuPrice = 2000;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else if(no == 6) {
				menuName = "에이드";
				menuPrice = 1200;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else if(no == 7) {
				menuName = "치킨버거";
				menuPrice = 3200;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				};
			}else if(no == 8) {
				menuName = "커피";
				menuPrice = 1000;
				System.out.println("주문하신 정보는 다음과 같습니다.");
				System.out.println(menuName + ":" + menuPrice);
				System.out.print("추가 주문하시겠습니까?[y/n] : ");
				char ch = sc.next().charAt(0);
				if(ch == 'n') {
					break;
				}
			}else {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}
			}
//		System.out.println("주문하신 정보는 다음과 같습니다.");
//		System.out.println(menuName);
//		System.out.println("총" + menuPrice + "원입니다.");
		
		} // method end
	
//	public void selectMenu2() {
//		
//		String orderlist = null;
//		int count = 0;
//		int total = 0;
//		String menuName = "";
//		int menuPrice = 0;
//		
//		while(true) {
//			System.out.print("*** 메뉴를 선택하세요 ***\n");
//			System.out.println();
//			System.out.println("햄버거 ***************");
//			System.out.println("1. 불고기버거 3500원");
//			System.out.println("2. 치킨버거 3200원");
//			System.out.println("추가 ****************");
//			System.out.println("3. 감자튀김 1000원");
//			System.out.println("4. 치즈스틱 400원");
//			System.out.println("5. 샐러드 2000원");
//			System.out.println("음료수 ***************");
//			System.out.println("6. 콜라	700원");
//			System.out.println("7. 에이드 1200원");
//			System.out.println("8. 커피 1000원");
//			System.out.println("********************");
//			System.out.println();
//			System.out.print("번호 선택 : ");
//			
//			int no = sc.nextInt();
//			
//			String menuName = "";
//			
//			case 1: 	
//				menuName = "불고기버거";
//				menuPrice = 3500;
//				System.out.println("추가 주문하시겠습니까?"); break;
//			
//			
//		}
//	}
//	
	
} // class end
	
	

	
