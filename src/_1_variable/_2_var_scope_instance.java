package _1_variable;

public class _2_var_scope_instance {
   // 클래스 레벨에서 선언된 인스턴스 변수
   String name;  // 객체마다 다른 값을 가질 수 있음
   int age;      // 객체마다 다른 값을 가질 수 있음
   
   public _2_var_scope_instance(String name, int age) {
       // 생성자에서 인스턴스 변수 초기화
       this.name = name;
       this.age = age;
   }

   public void displayInfo() {
       // 인스턴스 변수 사용
       System.out.println("Name: " + name + ", Age: " + age);
   }

   public static void main(String[] args) {
       // 객체 생성 시, 각 객체마다 독립적인 인스턴스 변수를 갖게 됨
       _2_var_scope_instance person1 = new _2_var_scope_instance("John", 30);
       _2_var_scope_instance person2 = new _2_var_scope_instance("Alice", 25);
       
       person1.displayInfo();  // Name: John, Age: 30
       person2.displayInfo();  // Name: Alice, Age: 25
   }
}
