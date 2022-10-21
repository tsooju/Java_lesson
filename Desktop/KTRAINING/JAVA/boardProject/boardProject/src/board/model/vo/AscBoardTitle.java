package board.model.vo;
// 5> 글제목순 오름차순정렬 처리용 클래스
public class AscBoardTitle implements java.util.Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		if(o1 instanceof Board && o2 instanceof Board) {
			Board b1 = (Board)o1;
			Board b2 = (Board)o2;
			
			result = b1.getBoardTitle().compareTo(b2.getBoardTitle());
		}

		return result;
	}

}
