package kr.ac.kopo.day05;

/**
 * 구구단과 관련된 메소드드들을 모아놓은 클래스
 * @author yeoju
 * @version 1.0
 */

public class Gugudan {
	
	/**           
	 * print(int dan)
	 * 호출자에서 넘겨준 단을 이용하여 구구단을 출력하는 메소드
	 * @param dan 출력할 구구단 단
	*/
	public void print(int dan) {
		
		System.out.println("**** " + dan + "단 ****");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	/**
	 * 전체 구구단(2~9단) 출력
	 */
	
	public void print() {
		
		print(2 , 9);
		
/*		for(int dan = 2; dan <= 9; dan++) {
			print(dan); */
		}

		
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param start 시작단
	 * @param end 종료단
	 */
	public void print(int start , int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
		
	}
	
	
	
	
	
	
	
	
	
/*		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 2; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n" ,dan , i , dan * i);
			}
		}
*/		
	
}