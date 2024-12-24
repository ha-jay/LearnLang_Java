package _5_oop_._2_inheritance;

public class Employee{
	//사원 정보를 담는 VO CLASS   private 접근 제한자를 사용하여 외부에서 접근 불가
	private String name;
	private int age;
	private  String phone;
	private String empData;
	private String dept;
	private boolean marriage;
	
	//부모의 생성자에서 초기화하는것이 바람   
	public Employee(String name, int age, String phone, String empData, String dept, boolean marriage){  
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.empData = empData;
		this.dept = dept;
		this.marriage = marriage;   
	}

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", phone=" + phone + ", empData=" + empData + ", dept=" + dept + ", marriage=" + marriage + "]";
    }
}  