package board.controller;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import board.model.vo.AscBoardDate;
import board.model.vo.AscBoardNo;
import board.model.vo.AscBoardTitle;
import board.model.vo.Board;
import board.model.vo.DescBoardDate;
import board.model.vo.DescBoardNo;
import board.model.vo.DescBoardTitle;

// 게시글 관리용 클래스 : board.controller.BoardManager.java
public class BoardManager {
	//Field
	private ArrayList<Board> list = new ArrayList<Board>();
	private Scanner sc = new Scanner(System.in);
	
	// 디폴트(매개변수 없는) 생성자 작성
	public BoardManager() {
//		Board[] board = new Board[10];
//
//		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("board_list.dat"));) {
//			for (int i = 0; i < board.length; i++) {
//				board[i] = (Board) objIn.readObject();
//				System.out.println(board[i]);
//			}
//		} catch (EOFException e) { 
//			System.out.println("board_list.dat 읽기 완료");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
	

	public void writeBoard(){
		Board br = new Board();
		Calendar calendar = Calendar.getInstance();  
		
		String title;
		String writer;
		Date date = calendar.getTime();
		String content;
		System.out.println("새 게시글 쓰기 입니다.");
		
		while(true) {
			System.out.print("글제목 : ");
			title = sc.next();
			System.out.print("작성자 : ");
			writer = sc.next();
			System.out.print("글내용 : ");
			while(true) {
				content = sc.nextLine();
				if(content.equals("exit")) {
					break;
				}
			}if(content.equals("exit")) {
				break;
			}	
		}
		list.add(new Board(0, title, writer, date, content, 0));
		
	} 
	

	public void displayAllList(){
		System.out.println(list.toString());
	}
	
	 public void displayBoard(){
		 Board br = new Board();
		 System.out.print("조회할 글번호 입력 : ");
		 int num = sc.nextInt();
		 switch(num) {
		 case 1: System.out.println(list.get(0)); 
		 		br.setReadCount(+1);
		 		break;
		 case 2: System.out.println(list.get(1)); 
	 		br.setReadCount(+1);
	 		break;
		 case 3: System.out.println(list.get(2)); 
	 		br.setReadCount(+1);
	 		break;
		 case 4: System.out.println(list.get(3)); 
	 		br.setReadCount(+1);
	 		break;
		 case 5: System.out.println(list.get(4)); 
	 		br.setReadCount(+1);
	 		break;
		 case 6: System.out.println(list.get(5)); 
	 		br.setReadCount(+1);
	 		break;
		 case 7: System.out.println(list.get(6)); 
	 		br.setReadCount(+1);
	 		break;
		 case 8: System.out.println(list.get(7)); 
	 		br.setReadCount(+1);
	 		break;
		 case 9: System.out.println(list.get(8)); 
	 		br.setReadCount(+1);
	 		break;
		 case 10: System.out.println(list.get(9)); 
	 		br.setReadCount(+1);
	 		break;
		 }
	 }
	 public void modifyTitle(){
		 System.out.print("수정할 글번호 입력 : ");
		 int num = sc.nextInt();
		 while(true) {
			 if(num == 1) {
				 System.out.println(list.get(0));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 if(num == 2) {
				 System.out.println(list.get(1));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 if(num == 3) {
				 System.out.println(list.get(2));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 if(num == 4) {
				 System.out.println(list.get(3));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 if(num == 5) {
				 System.out.println(list.get(4));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 if(num == 6) {
				 System.out.println(list.get(5));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardTitle(sc.next());
				 break;
			 }
			 
			 
		 } 
		 System.out.println(list);
		 
		 
	 }
	 public void modifyContent(){
		 System.out.print("수정할 글번호 입력 : ");
		 int num = sc.nextInt();
		 while(true) {
			 if(num == 1) {
				 System.out.println(list.get(0));
				 System.out.print("변경할 내용 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 if(num == 2) {
				 System.out.println(list.get(1));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 if(num == 3) {
				 System.out.println(list.get(2));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 if(num == 4) {
				 System.out.println(list.get(3));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 if(num == 5) {
				 System.out.println(list.get(4));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 if(num == 6) {
				 System.out.println(list.get(5));
				 System.out.print("변경할 이름 입력 : ");
				 list.get(0).setBoardContent(sc.next());
				 break;
			 }
			 
			 
		 } 
		 System.out.println(list);
	 }
	 public void deleteBoard(){
		 System.out.print("삭제할 글번호 입력 : ");
		 int num = sc.nextInt();
		 while(true) {
			 if(num == 1) {
				 System.out.println(list.get(0));
				 System.out.print("정말 삭세하시겠습니까?[y/n] : ");
				 char ch = sc.next().toUpperCase().charAt(0);
				 if(ch == 'Y') {
					 list.remove(0);
					 System.out.println("삭제 되었습니다");
					 break;
				 }else {
					 System.out.print("삭제할 글번호 입력 : ");
				 }
				 break;
			 }
			 if(num == 2) {
				 System.out.println(list.get(1));
				 System.out.print("정말 삭세하시겠습니까?[y/n] : ");
				 char ch = sc.next().toUpperCase().charAt(0);
				 if(ch == 'Y') {
					 list.remove(1);
					 System.out.println("삭제 되었습니다");
					 break;
				 }else {
					 System.out.print("삭제할 글번호 입력 : ");
				 }
				 break;
			 }
			 if(num == 3) {
				 System.out.println(list.get(2));
				 System.out.print("정말 삭세하시겠습니까?[y/n] : ");
				 char ch = sc.next().toUpperCase().charAt(0);
				 if(ch == 'Y') {
					 list.remove(2);
					 System.out.println("삭제 되었습니다");
					 break;
				 }else {
					 System.out.print("삭제할 글번호 입력 : ");
				 }
				 break;
			 }
			 if(num == 4) {
				 System.out.println(list.get(3));
				 System.out.print("정말 삭세하시겠습니까?[y/n] : ");
				 char ch = sc.next().toUpperCase().charAt(0);
				 if(ch == 'Y') {
					 list.remove(3);
					 System.out.println("삭제 되었습니다");
					 break;
				 }else {
					 System.out.print("삭제할 글번호 입력 : ");
				 }
				 break;
			 }
			 if(num == 5) {
				 System.out.println(list.get(4));
				 System.out.print("정말 삭세하시겠습니까?[y/n] : ");
				 char ch = sc.next().toUpperCase().charAt(0);
				 if(ch == 'Y') {
					 list.remove(4);
					 System.out.println("삭제 되었습니다");
					 break;
				 }else {
					 System.out.print("삭제할 글번호 입력 : ");
				 }
				 break;
			 }
		 } 
		 System.out.println(list);
	 }
	 public void searchBoard(){
		 System.out.print("검색할 제목 : ");
		 String title = sc.next();
		 System.out.println(list.indexOf(title));
	 }
	 
	 public void saveListFile(){
		 try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("board_list.dat"))) {
			for(Object obj : list) {
				objOut.writeObject(obj);
			}
			System.out.println("board_list.dat 에 저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 public void sortList(int item, boolean isDesc){
		 switch(item) {
		 case 1: 
			if(false) {
				list.sort(new AscBoardNo());
				System.out.println(list);
			}else {
				list.sort(new DescBoardNo());
				System.out.println(list);
			}
			 break;
		 case 2:
			 if(false) {
				 list.sort(new AscBoardDate());
				 System.out.println(list);
			 }else {
				 list.sort(new DescBoardDate());
				 System.out.println(list);
			 }
			 break;
			 
		 case 3: 
			 if(false) {
				 list.sort(new AscBoardTitle());
				 System.out.println(list);
			 }else {
				 list.sort(new DescBoardTitle());
				 System.out.println(list);
			 }
			 break;

		 }
		 
		 
		 
	 }
	 
	
	
	
	
	
}
