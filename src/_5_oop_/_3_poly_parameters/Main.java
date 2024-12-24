package _5_oop_._3_poly_parameters;

public class Main {
    // 다형성을 활용한 메서드
    static void renderShape(Shape shape) {
        shape.draw(); // 전달된 객체에 따라 적절한 draw() 메서드 호출
    }

    public static void main(String[] args) {
        Shape circle = new Circle();       // Circle 객체
        Shape rectangle = new Rectangle(); // Rectangle 객체
        Shape triangle = new Triangle();   // Triangle 객체

        // renderShape 메서드 호출
        renderShape(circle);    // Drawing a circle
        renderShape(rectangle); // Drawing a rectangle
        renderShape(triangle);  // Drawing a triangle
    }
}
