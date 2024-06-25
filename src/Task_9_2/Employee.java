package Task_9_2;

import Task_9_1_Month.Month;
import Task_9_1_Month.MonthUtils;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;

    public Employee(String name, int age, String sex, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
    public double getSalary(Month[] monthArray) {
        double daySalary = getSalaryPerDay();
        double resultSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            String currentMonthWorkDays = monthArray[i].getWorkDays();
            resultSalary += Integer.parseInt(currentMonthWorkDays) * daySalary;
        }
        return resultSalary;
    }
}
