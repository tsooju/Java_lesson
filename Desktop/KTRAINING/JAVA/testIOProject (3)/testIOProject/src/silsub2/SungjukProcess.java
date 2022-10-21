package silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SungjukProcess {
	public SungjukProcess() {} // 기본 생성자
	

	//Field
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		SungjukProcess sp = new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();
	}
	
	public void sungjukSave(){

		int kor;
		int eng;
		int mat;
		int tot;
		double avr;
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();
		
		tot = kor + eng + mat;
		avr = tot/3;
		
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"));) {
			while(true) {

				dout.writeInt(kor);
				dout.writeInt(eng);
				dout.writeInt(mat);
				dout.writeInt(tot);
				dout.writeDouble(avr);

				dout.flush();
				System.out.print("저장하시겠습니까?[y/n] : ");
				char ch = sc.next().toUpperCase().charAt(0);
					if(ch == 'Y') {
						return;
					}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("score.dat 에 저장 완료.");
		
	} // method end
	
	public void scoreRead(){
		
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.dat"));) {
			int kor = din.readInt();
			int eng = din.readInt();
			int mat = din.readInt();
			int tot = din.readInt();
			double avr = din.readDouble();
			
			System.out.printf("%d  %d  %d  %d %.01f\n", kor, eng, mat, tot, avr);
			System.out.println("읽기 완료");
		} catch(EOFException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

} // class end
