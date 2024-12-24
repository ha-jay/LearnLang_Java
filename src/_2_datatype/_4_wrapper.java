package _2_datatype;

import java.util.ArrayList;
import java.util.List;

public class _4_wrapper {
    public static void main(String[] args) {
        //wrapper클래스는 기본타입을 객체로 변환하는 클래스입니다.
        //기본타입을 객체로 변환하는 이유는 기본타입은 객체가 아니므로, 객체의 기능을 사용할 수 없습니다.
        //wrapper클래스는 기본타입을 객체로 변환하여 객체의 기능을 사용할 수 있도록 합니다.
        //주로 컬렉션프레임워크에서 사용됩니다. , null값 할당위해 사용합니다.
        

        //기본타입을 객체로 변환하는 방법
        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //객체를 기본타입으로 변환하는 방법
        Integer c = Integer.valueOf(10);
        int d = c.intValue();
        System.out.println(d);

        //오토박싱과 오토언박싱
        //오토박싱 : 기본타입을 객체로 자동으로 변환
        int num = 10;
        Integer integerObj = num;  // int -> Integer (자동 박싱)
        System.out.println(integerObj);

        //오토언박싱 : 객체를 기본타입으로 자동으로 변환
        Integer integerObj2 = 20;
        int num2 = integerObj2;  // Integer -> int (자동 언박싱)
        System.out.println(num2);

        //객체로 변환후 유용한 메서드 사용예시
        String str = "123";
        int num3 = Integer.parseInt(str);  // 문자열을 int로 변환
        System.out.println(num3);  // 출력: 123

        //컬렉션 프레임워크에서 사용예시
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);  // int -> Integer (자동 박싱)
        numbers.add(20);  // int -> Integer (자동 박싱) 
        System.out.println(numbers);

        //null값 할당예시
        Integer nullInteger = null;
        System.out.println(nullInteger);
    }
}
