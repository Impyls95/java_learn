public class Person {

    String name;
    int age;
    String gender;


    String getName() {
        String result = "";
        if (gender.equalsIgnoreCase("male")) {
            result = "Mr. " + name;
        } else if (gender.equalsIgnoreCase("female")) {
            result = "Mrs. " + name;
        } else {
            result = name;
        }
        return result;
    }
}
