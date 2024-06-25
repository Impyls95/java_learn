import Task_9_1_Month.Month;
import Task_9_1_Month.MonthUtils;
import Task_9_2.Employee;
import Task_9_3.Manager;

public class Main {
    public static void main(String[] args) {

        // for task_9_1
        Month[] months = MonthUtils.getAllMonth();
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i].toString());
        }

        System.out.println("================================================");


        Employee anna = new Employee("Anna", 28, "female", 1000.0);
        Month[] reportSalaryMonthAnna = {MonthUtils.months[0], MonthUtils.months[1]};
        System.out.println(anna.getSalary(reportSalaryMonthAnna));

        System.out.println("===============================================");


        Manager andrey = new Manager("Андрей", 35, "male", 2000.0, 5);
        Month[] reportSalaryMonthAndrey = {MonthUtils.months[2], MonthUtils.months[3]};
        System.out.println(andrey.getSalary(reportSalaryMonthAndrey));
    }
}
