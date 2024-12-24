package _5_oop_._4_abstract_class;

// 정규직 클래스: FullTimeEmployee
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
