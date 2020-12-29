package DevetoPredavanje.Enumareted;

public enum Gender{

    FEMALE, MALE, UNKNOWN;

    private  Gender(){
        System.out.println("Poziva se konstruktor gender.");
    }

}
