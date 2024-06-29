package Task_9_1_Month;

public final class Month {
    private final String nameMonth;
    private final String allDays;
    private final String workDays;

    public Month(String nameMonth, String allDays, String workDays) {
        this.nameMonth = nameMonth;
        this.allDays = allDays;
        this.workDays = workDays;
    }
    public String toString() {
        return nameMonth + ": " + allDays + " days, " + workDays + " working days";
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public String getAllDays() {
        return allDays;
    }

    public String getWorkDays() {
        return workDays;
    }
}
