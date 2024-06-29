package Task_10;

public class Worker extends Employee {

    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }
}
