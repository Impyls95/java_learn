package Task_10;

public final class Director extends AbstractManager {
    public final static int PERCENT_PER_SUBORDINATE = 9;

    public Director(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    protected double getBonus() {
        return getBaseSalary() * PERCENT_PER_SUBORDINATE / 100;
    }
}
