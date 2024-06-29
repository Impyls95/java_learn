package Task_10;

public final class Manager extends AbstractManager{

    public final static int PERCENT_PER_SUBORDINATE = 3;

    public Manager(double baseSalary, String name) {
        super(baseSalary, name);
    }

    @Override
    protected final double getBonus() {
        return getBaseSalary() * PERCENT_PER_SUBORDINATE / 100;
    }

}
