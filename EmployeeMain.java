public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", "사원", 3000);
		Employee e2 = new Employee("고길동", "사원", 3200);
		Employee e3 = new Employee("윤길동", "대리", 3500);
		
		e.info(); e2.info(); e3.info();
		
		Employee.employeeCntInfo();
		
	}

}
