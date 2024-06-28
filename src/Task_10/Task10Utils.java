package Task_10;

import java.io.LineNumberReader;
import java.lang.reflect.Member;

public class Task10Utils {

    public static Employee findEmployeeByName(Employee[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                return arr[i];
            }
        }
        return null;
    }

    public static Employee findEmployeeBySubstrName(Employee[] arr, String substr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(substr)) {
                return arr[i];
            }
        }
        return null;
    }

    public static double salaryBudgetForArray(Employee[] arr) {
        double res = 0.0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].getSalary();
        }
        return res;
    }

    public static double findMinSalary(Employee[] arr) {
        double min = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < min) {
                min = arr[i].getSalary();
            }
        }
        return min;
    }

    public static double findMaxSalary(Employee[] arr) {
        double max = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() > max) {
                max = arr[i].getSalary();
            }
        }
        return max;
    }

    public static int findMinCountSubordinates(Manager[] arr) {
        int min = arr[0].getNumberOfSubordinates();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberOfSubordinates() < min) {
                min = arr[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int findMaxCountSubordinates(Manager[] arr) {
        int max = arr[0].getNumberOfSubordinates();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberOfSubordinates() > max) {
                max = arr[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public static double findMaxAllowance(Manager[] arr) {
        double res = arr[0].getSalary() - arr[0].getBaseSalary();
        for (int i = 0; i < arr.length; i++) {
            double currAllowance = arr[i].getSalary() - arr[i].getBaseSalary();
            if (currAllowance > res) {
                res = currAllowance;
            }
        }
        return res;
    }

    public static double findMinAllowance(Manager[] arr) {
        double res = arr[0].getSalary() - arr[0].getBaseSalary();
        for (int i = 0; i < arr.length; i++) {
            double currAllowance = arr[i].getSalary() - arr[i].getBaseSalary();
            if (currAllowance < res) {
                res = currAllowance;
            }
        }
        return res;
    }

}