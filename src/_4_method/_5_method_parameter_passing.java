package _4_method;

class MyObject {
    int value;

    MyObject(int value) {
        this.value = value;
    }
}

public class _5_method_parameter_passing {
    //call by value - 값을 복사해서 전달
    public static void modifyValue(int value) {
        value = 100; // 어떤 변수가 들어오던 그값을 100으로 변경
    }

    //call by reference - 객체의 주소를 전달
    public static void modifyObject(MyObject obj) {
        obj.value = 100; // 객체의 속성을 무조건 100으로 변경
    }

    public static void main(String[] args) {

        //call by value
        int num = 50;
        System.out.println("Before method call: " + num); // 50
        modifyValue(num); // num의 복사본이 전달됨
        System.out.println("After method call: " + num); // 50 - 기존 instance변수의 50의 값이 변경되지않음.

        //call by reference
        MyObject obj = new MyObject(50);
        System.out.println("Before method call: " + obj.value); // 50
        modifyObject(obj); // 참조 값의 복사본이 전달됨
        System.out.println("After method call: " + obj.value); // 100 (속성 변경됨)
        
    }
}
