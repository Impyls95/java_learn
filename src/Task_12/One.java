package Task_12;

import java.util.*;

public class One {

    public static void main(String[] args) {

        String[] arr = {"White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"};
        List<String> myList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(myList);
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("l")) {
                iterator.remove();
            }
        }
        System.out.println(myList);




        List<Integer> myList2 = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            myList2.add(i);
        }
        System.out.println(myList2);


        Iterator<Integer> iterator3 = myList2.iterator();
        while (iterator3.hasNext()) {
            int value = iterator3.next();
            if (value % 2 == 0) {
                iterator3.remove();
            }
        }
        System.out.println(myList2);


        List<String> myList4 = new ArrayList<>(Arrays.asList("апельсин", "яблоко", "банан", "груша", "виноград",
                "персик", "слива", "манго", "киви", "ананас",
                "лимон", "лайм", "кокос", "гранат", "малина",
                "ежевика", "черника", "клубника", "арбуз", "дыня",
                "вишня", "черешня", "инжир", "абрикос", "нектарин",
                "папайя", "помело", "грейпфрут", "смородина", "крыжовник"));
        Map<Character, String> myMap4 = new HashMap<>();
        for (int i = 0; i < myList4.size(); i++) {
            if (myMap4.get(myList4.get(i).charAt(0)) == null || myMap4.get(myList4.get(i).charAt(0)).length() < myList4.get(i).length()) {
                myMap4.put(myList4.get(i).charAt(0), myList4.get(i));
            }
        }
        System.out.println(myMap4);
    }

}
