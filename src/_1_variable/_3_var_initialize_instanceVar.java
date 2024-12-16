package _1_variable;

public class _3_var_initialize_instanceVar {
      // 인스턴스 변수 (자동으로 기본값이 할당됨)
      boolean flag;      // 기본값: false
      int number;        // 기본값: 0
      String name;       // 기본값: null
  
      public void display() {
          System.out.println("flag: " + flag);   // false
          System.out.println("number: " + number); // 0
          System.out.println("name: " + name);    // null
      }
  
      public static void main(String[] args) {
          _3_var_initialize_instanceVar obj = new _3_var_initialize_instanceVar();
          obj.display();
      }
       
}
