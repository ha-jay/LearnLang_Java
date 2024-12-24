package _5_oop_._4_abstract_class;

// 시간제 직원 클래스: PartTimeEmployee
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}