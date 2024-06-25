package noname;

public class Lesson_5 {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 3, 4},
                {4, 7, 9, 3},
                {2, 6, 3, 1, 7}
        };

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
