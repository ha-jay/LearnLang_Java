package _2_datatype;

public class _3_typecasting_object_downcasting {
    public static void main(String[] args) {
        //downcasting은 부모타입을 자식타입으로 변환하여 자식의 고유기능에 접근할때 사용합니다. 
        

         // Upcasting
         Animal x = new Cat();


         // Downcasting
         Cat y = (Cat) x; // 명시적으로 자식타입으로 변환
         y.sound(); // Cat의 sound() 메서드 호출
         y.night(); // Cat의 고유메서드인 night() 메서드 호출
    }
}
