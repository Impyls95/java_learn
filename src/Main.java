import Task_10.*;
import Task_9_1_Month.Month;
import Task_9_1_Month.MonthUtils;
import Task_9_4.LicensePlateMaker;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        LicensePlateMaker californiaMaker = new LicensePlateMaker("CA");
        LicensePlateMaker newYorkMaker = new LicensePlateMaker("NY");

        System.out.println(californiaMaker.makeNextPlate());
        System.out.println(californiaMaker.makeNextPlate());
        System.out.println(newYorkMaker.makeNextPlate());
        System.out.println(californiaMaker.makeNextPlate());







    }
}
