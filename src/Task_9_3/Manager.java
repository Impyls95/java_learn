package Task_9_3;

import Task_9_1_Month.Month;

public class Manager {
    private String name;
    private int age;
    private String sex;
    private double salaryPerDay;
    int subordinateCount;

    public Manager(String name, int age, String sex, double salaryPerDay, int subordinateCount) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.subordinateCount = subordinateCount;
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

    public int getSubordinateCount() {
        return subordinateCount;
    }

    public void setSubordinateCount(int subordinateCount) {
        this.subordinateCount = subordinateCount;
    }

    public double getSalary(Month[] monthArray) {
        double daySalary = getSalaryPerDay();
        double resultSalary = 0;
        double coeffSalary = getSubordinateCount() * 0.01;

        for (int i = 0; i < monthArray.length; i++) {
            String currentMonthWorkDays = monthArray[i].getWorkDays();
            resultSalary += Integer.parseInt(currentMonthWorkDays) * daySalary;
        }
        resultSalary += resultSalary * coeffSalary;
        return resultSalary;
    }
}
