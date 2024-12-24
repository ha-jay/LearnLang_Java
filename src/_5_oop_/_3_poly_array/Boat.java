package _5_oop_._3_poly_array;

// 자식 클래스: Boat
public class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat is sailing on water");
    }
}