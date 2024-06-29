package Task_9_2;

import Task_9_1_Month.Month;

public abstract class BaseEmployee {
    private final String name;
    private final double salaryPerDay;
    private final int age;
    private final String sex;

    public BaseEmployee(String name, double salaryPerDay, int age, String sex) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.age = age;
        this.sex = sex;
    }

    public abstract double getSalary(Month[] monthArray);


    public String getName() {
        return name;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    protected double getBaseSalary(Month[] monthArray) {
        double res = 0;
        for (int i = 0; i < monthArray.length; i++) {
            res += Integer.parseInt(monthArray[i].getWorkDays()) * getSalaryPerDay();
        }
        return res;
    }
}
