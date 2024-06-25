package noname;

import java.util.Arrays;

public class Task_4_1 {
    public static void main(String[] args) {

//        for (int i = 0; i <= 15; i++) {
//            System.out.println(i);
//        }


//        for (int i = 5; i < 10000; i *= 5) {
//            System.out.println(i);
//        }


//        for (int i = 40; i <= 60; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }
//        for (int i = 40; i <= 60; i += 4) {
//            System.out.println(i);
//        }


//        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                System.out.println(arr[i]);
//            }
//        }



//        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 5) {
//                System.out.println(arr[i]);
//            }
//        }


        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 15;
        }
        System.out.println(Arrays.toString(arr));

    }
}
