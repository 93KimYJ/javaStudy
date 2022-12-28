public class StaticMain01 {
	
	static String name = "길동";
	static int age = 10;
	
	public static void main(String[] args) {
		
		// static : 하나만 만들어서 공유해서 사용 
		// 클래스당 하나만 만들어지고 클래스 이름으로 접근하는 방식이라 클래스변수라고 불린다
		
		System.out.println(name);
		System.out.println(age);
		// 스태틱 영역에서 넌스태틱 영억에 접근할 수 없다.
		// 넌스태틱에선 스태틱 영역에 접근할 수 있다.
		
		/*
		 		class main{
		 			static int count = 100;
		 			public void call() {
		 			System.out.println(count);     // 넌스태틱에서 스태틱영역 접근가능
		 			{
		 */
		
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100000; i++) {
			sb.append(i);   // +
		}
		
/*		String str = "";
		for(int i = 0; i < 100000; i++) {
			str = str + i;
		}
*/		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		
}
}