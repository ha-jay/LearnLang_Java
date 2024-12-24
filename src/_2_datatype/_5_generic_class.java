package _2_datatype;

//젠네릭 클래스 예시
class Box<T> {  //T는 타입 매개변수, 
    private T value; //T타입의 변수 

    public void setValue(T value) { //메서드 매개변수의 타입
        this.value = value;
    }

    public T getValue() {//메서드 반환타입
        return value;
    }
}

public class _5_generic_class {
    public static void main(String[] args) {
        //제네릭은 클래스나 인터페이스, 메서드에서  사용되는 타입을 매개변수로 지정하는 것입니다.
        //제네릭은 타입을 컴파일 시점에 검사하여 안전하게 사용할 수 있도록 도와줍니다.
       
         // Integer 타입을 위한 Box 객체 생성
         Box<Integer> intBox = new Box<>();
         intBox.setValue(10);
         System.out.println("Integer Value: " + intBox.getValue());
 
         // String 타입을 위한 Box 객체 생성
         Box<String> strBox = new Box<>();
         strBox.setValue("Hello");
         System.out.println("String Value: " + strBox.getValue());
    }
}
