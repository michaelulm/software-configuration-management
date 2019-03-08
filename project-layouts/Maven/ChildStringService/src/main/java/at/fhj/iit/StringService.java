package at.fhj.iit;

public class StringService {

    public static String firstToUpper(String s){
        String first = s.substring(0,1);
        StringBuilder sb = new StringBuilder();
        sb.append(first.toUpperCase());
        sb.append(s.substring(1));

        return sb.toString();
    }
}
