package OsmoPredavanje;

public class Student extends Person{
    private String indexnumber;

    public Student() {
        System.out.println("Poziva se konstruktor klase student.");
            }

    public String getIndexnumber() {
        return indexnumber;
    }

    public void setIndexnumber(String indexnumber) {
        this.indexnumber = indexnumber;
    }
}
