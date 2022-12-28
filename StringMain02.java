
import java.util.Arrays;

// trim() --> 양쪽의 공백을 제거
// toLowerCase --> 소문자로 변환   toUpperCase --> 대문자로 반환

public class StringMain02 {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		char ch = 'l';
		
		int index = str.indexOf(ch);      // 찾는 문자가 여러개일경우 가장 앞에있는거만 출력됨
		System.out.printf("검색하신 문자 [%c]은(는) [%d] 번째 위치에 있습니다.\n" , ch , index);
		
		//String searchStr = "ll";
		String searchStr = "rr";       // 찾는 문자열이 없으면 -1로 출력된다.
		index = str.indexOf(searchStr);
		
		System.out.printf("문자열 [%s]는 [%d]번째 위치에 있습니다.\n" , searchStr , index);
				
		
		String subStr = str.substring(3 , 8);
		System.out.println("substring(3, 8) : " + subStr);
		subStr = str.substring(3);
		System.out.println("substring(3) : " + subStr);
		
		System.out.println("str : " + str);
		String repStr = str.replace('o' , 'O');
		System.out.println("replace('o' , 'O') : " + repStr);
		
		repStr = str.replace("l", "rr");
		System.out.println("replace('l', 'rr') : " + repStr);
		
		System.out.println("대문자 변환 : " + str.toUpperCase());
		System.out.println("소문자 변환 : " + str.toLowerCase());
		
		str = "010-1111-2222";
		String[] strArr = str.split("-");
		System.out.println("split('-') : " + Arrays.toString(strArr));
		
		double num = 12.34;                  // %f float
		System.out.printf("실수 : %f\n" , num + 10);
		System.out.printf("valueOf(num) : %s\n" , String.valueOf(num) + 10);
		
		String strNum = String.valueOf(num);  // --> 실수 문자열 변환
		strNum = num + "";
		
		
	}

}