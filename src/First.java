public class First {

    public static void main(String[] args) {

//        Person p1 = new Person();
//        p1.name = "Roman";
//        p1.age = 28;
//        p1.gender = "male";
//
//        Person p2 = new Person();
//        p2.name = "Anna";
//        p2.age = 28;
//        p2.gender = "female";
//
//        Person[] persons = {p1, p2};
//
//        for (int i = 0; i < persons.length; i++) {
//            System.out.println(persons[i].getName());
//        }


        Employee emp1 = new Employee();
        emp1.name = "Roman";
        emp1.age = 28;
        emp1.gender = "male";
        emp1.salary = 3000;

        Employee emp2 = new Employee();
        emp2.name = "Roman";
        emp2.age = 36;
        emp2.gender = "male";
        emp2.salary = 3800;

        Employee emp3 = new Employee();
        emp3.name = "Anna";
        emp3.age = 28;
        emp3.gender = "female";
        emp3.salary = 3200;

//        System.out.println(emp2.isSameName(emp3));
        Employee[] empArr = {emp1, emp2, emp3};
        int totalSalary = Salary.getSum(empArr);
        System.out.println(totalSalary);

    }

//    public static String countingSheep(int num) {
//        String sheep = " sheep...";
//        String res = "1 sheep...";
//        if (num > 0) {
//            for (int i = 2; i <= num; i++) {
//                res = res + (i + sheep);
//            }
//            return res;
//        }
//        return "";
//    }
}

