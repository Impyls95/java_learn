public class Employee {

    String name;
    int age;
    String gender;
    int salary;

    boolean isSameName(Employee employee) {
        return name.equalsIgnoreCase(employee.name);
    }
}
