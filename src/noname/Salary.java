package noname;

public class Salary {

    static int getSum(Employee[] employeeArray) {
        int sumAllSalary = 0;

        for (int i = 0; i < employeeArray.length; i++) {
            sumAllSalary += employeeArray[i].salary;
        }
        return sumAllSalary;
    }
}
