package Task_10;

public abstract class AbstractManager extends Employee{
    private int numberOfSubordinates;

    public AbstractManager(double baseSalary, String name) {
        super(baseSalary, name);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + getBonus();
    }

    protected abstract double getBonus();
}
