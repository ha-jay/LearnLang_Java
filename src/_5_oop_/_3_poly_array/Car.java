package _5_oop_._3_poly_array;

// 자식 클래스: Car
public class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car is driving on the road");
    }
}