package Task_9_2;

import Task_9_1_Month.Month;

public final class Employee extends BaseEmployee{

    public Employee(String name, double salaryPerDay, int age, String sex) {
        super(name, salaryPerDay, age, sex);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        return  getBaseSalary(monthArray);
    }
}
