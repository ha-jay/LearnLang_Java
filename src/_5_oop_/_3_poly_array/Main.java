package _5_oop_._3_poly_array;

public class Main {
    public static void main(String[] args) {
        // 다형성 배열 생성 - 부모의 타입으로 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // 배열에 다양한 자식 클래스 객체 저장
        vehicles[0] = new Car();
        vehicles[1] = new Boat();
    

    
        // 배열을 순회하며 각 객체의 move 메서드 호출
        for (Vehicle vehicle : vehicles) {
            vehicle.move(); // 다형성에 따라 적절한 메서드 호출
        }
    }
}
