public class StringMain01 {
	
	public static void main(String[] args) {
		
		String[] names = {"홍길동" , "홍길순" , "나길동" , "나복순" , "윤복순" , "윤수길"};
		
		// startsWith endsWith equals  문자열 비교
		for(String name : names) {
			if(name.endsWith("동")) {
				System.out.println(name);
			}
		}
		
		for(String name : names) {
			if(name.startsWith("나")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 길이 포함된 회원 목록 출력 >");
		for(String name : names) {
			if(name.contains("길")) {
				System.out.println(name);
			}
		}
		
		String str = "apple";
		String str2 = "az";
		
		int cmp = str.compareTo(str2);
		if(cmp == 0) {
			System.out.println(str + "==" + str2);
		} else if(cmp > 0) {
			System.out.println(str + " > " + str2);
		} else {
			System.out.println(str + " < " + str2);
		}
		
		
		
		
		
	}
}