package noname;

public class Task_5 {
    public static void main(String[] args) {
//        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);



//        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            } else if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Max elem: " + max + "\n" + "Min elem: " + min);



//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double avg = 1.0 * sum / arr.length;
//        System.out.println(avg);



//        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println(sum);



//        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);



//        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        int lenAllElem = 0;
//        for (int i = 0; i < arr.length; i++) {
//            lenAllElem += arr[i].length;
//        }
//        System.out.println(lenAllElem);



//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int counter = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - counter; j++) {
//                System.out.print(arr[j] + " ");
//            }
//            System.out.println();
//            counter += 1;
//        }
//


//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int counter = 0;
//        String space = "  ";
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - counter; j++) {
//                System.out.print(arr[j] + " ");
//            }
//            counter += 1;
//            System.out.println();
//            System.out.print(space);
//            space += "  ";
//        }



        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int counter = 0;
        String space = "  ";
        for (int i = 0; i < arr.length; i++) {
            for (int k = arr.length - 1 - counter; k > 0; k--) {
                System.out.print(arr[k] + " ");
            }
            for (int j = 0; j < arr.length - counter; j++) {
                System.out.print(arr[j] + " ");
            }

            counter += 1;
            System.out.println();
            System.out.print(space);
            space += "  ";
        }

    }
}
