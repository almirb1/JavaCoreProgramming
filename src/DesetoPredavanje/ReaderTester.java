package DesetoPredavanje;

public class ReaderTester {
    public static void main(String[] args) {
        Reader reader = ReaderFactroy.getReader("XML");
        String readedValue = reader.read();
        System.out.println(readedValue);
    }
}
