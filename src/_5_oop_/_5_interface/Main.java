package _5_oop_._5_interface;
/*
 * 인터페이스(Payment):
결제 방식을 정의하는 추상 메서드 processPayment를 선언합니다.
모든 결제 방식 클래스는 이 메서드를 구현해야 합니다.

구현 클래스:
CreditCardPayment, PayPalPayment, BankTransferPayment 클래스는 Payment 인터페이스를 구현합니다.
각 클래스는 자신만의 결제 처리 로직을 제공합니다.

다형성 활용:
Payment 타입 배열을 사용하여 다양한 결제 방식을 저장하고, 반복문으로 processPayment를 호출합니다.
런타임에 객체의 실제 타입에 따라 올바른 메서드가 호출됩니다.

 */
public class Main {
    public static void main(String[] args) {
        // 인터페이스 타입 배열 생성
        Payment[] payments = new Payment[3];

        // 다양한 결제 방식 객체 저장
        payments[0] = new CreditCardPayment();
        payments[1] = new PayPalPayment();
        payments[2] = new BankTransferPayment();

        // 각 결제 방식을 순회하며 결제 처리
        for (Payment payment : payments) {
            payment.processPayment(100.0); // 다형성에 따라 적절한 메서드 호출
        }
    }
}
