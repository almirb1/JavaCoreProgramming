package DevetoPredavanje.Enumareted;

public enum SeasonEnum {

    LJETO(6,9, "ljeto"),
    JESEN (9,12,"jesen"),
    ZIMA(12,3,"zima"),
    PROLJEĆE(3,6,"proljeće");
    private final int startMonth;
    private final int endMonth;
    private final String name;

    private SeasonEnum(int startMonth, int endMonth, String name) {
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.name = name;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getEndMonth() {
        return endMonth;
    }

    public String getName() {
        return name;
    }
}
