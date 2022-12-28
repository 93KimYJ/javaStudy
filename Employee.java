class Employee {
	
	String name;
	String grade;
	int salary;
	static int employeeCnt;  // 총 사원수를 기억하기 위한 변수
	
	Employee(){
		Employee.employeeCnt++;
	}
	
	Employee(String name, String grade, int salary){
		this();
		this.name = name; this.grade = grade; this.salary = salary;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 직급 : " + grade + ", 연봉 : " + salary + "만원");
	}
	
	static void employeeCntInfo() {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
	
	// employeeCnt 변수를 돌리면 e , e2 , e3객체가 각각 하나씩 사용하기 때문에 static으로 공유되게 만들어 준다.
	// static은 클래스명을 붙인 변수로 사용 하는것이 좋다
	
	
}
