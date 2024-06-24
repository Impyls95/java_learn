import java.util.Locale;

public class Task_6 {
    public static void main(String[] args) {
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++) {
//            char elem = s.charAt(i);
//            if (elem == 'о') {
//                System.out.println(s.charAt(i));
//            }
//        }


//        String s = "Перевыборы выбранного президента";
//        int totalE = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'е') {
//            totalE += 1;
//            }
//        }
//        System.out.println(totalE);



//        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
//        int total = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (!array[i][j].contains("е")) {
//                    total += 1;
//                }
//            }
//
//        }
//        System.out.println(total);



//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase();
//        int indexCounter = 0;
//
//        while (s.contains("рит")) {
//            int index = s.indexOf("рит");
//            System.out.println(index + indexCounter);
//            s = s.substring(index + 3);
//            indexCounter += index + 3;
//        }




        System.out.println(sum(4, 6));
        System.out.println(subtraction(11, 6));
        System.out.println(multiply(5, 5));
        System.out.println(division(100, 10));


    }
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return  a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
}
