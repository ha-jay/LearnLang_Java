package _5_oop_._2_inheritance;

//상속 클래스
public class RempVO extends Employee{
	public RempVO(String name, int age, String phone, String empData, String dept, boolean marriage){
        //부모의 기억공간에 자식의 정보가 있다. 이 것을 초기화 하는것은 부모가 직접하는게 맞다. 
		//받은 인자를 부모의 생성자로 전달    
		super(name, age, phone, empData, dept, marriage);
	}
}   
