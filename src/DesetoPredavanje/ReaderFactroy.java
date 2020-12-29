package DesetoPredavanje;

public class ReaderFactroy {
    public static Reader getReader(String readerType){
        Reader reader = null;
        if(readerType.equals("XML")){
            reader = new XMLReader();
        }else if(reader.equals("CSV")){
            reader = new CSVReader();
        }else if (readerType.equals("DB")){
            reader = new DBReader();
        }
        return reader;
    }
}
