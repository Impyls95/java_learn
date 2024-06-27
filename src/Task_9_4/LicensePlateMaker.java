package Task_9_4;

public class LicensePlateMaker {

    private final String prefix;
    private int currentNumber;

    public LicensePlateMaker(String prefix) {
        this.prefix = prefix;
        this.currentNumber = 0;
    }

    public LicensePlate makeNextPlate() {
        currentNumber++;
        String plateNumber = prefix + "-" + currentNumber;
        return new LicensePlate(plateNumber);
    }
}
