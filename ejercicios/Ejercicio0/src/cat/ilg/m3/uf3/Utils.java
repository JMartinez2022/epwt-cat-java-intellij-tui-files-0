package cat.ilg.m3.uf3;

public class Utils {
    public static int stringToInt(String str){
        int n = 0;
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.err.println("Bad number");
        }
        return n;
    }
}