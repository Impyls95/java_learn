package Task_10;

public class Director extends Manager {

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return getBaseSalary() * (1.0 * getNumberOfSubordinates() / 100 * 9);
        }
    }
}
