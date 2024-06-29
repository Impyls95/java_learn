package Task_9_3;

import Task_9_1_Month.Month;
import Task_9_2.BaseEmployee;

public final class Manager extends BaseEmployee {
    private final int subordinateCount;

    public Manager(String name, double salaryPerDay, int age, String sex, int subordinateCount) {
        super(name, salaryPerDay, age, sex);
        this.subordinateCount = subordinateCount;
    }


    public int getSubordinateCount() {
        return subordinateCount;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return  getBaseSalary(monthArray) * (1 + subordinateCount * 0.01);
    }
}
