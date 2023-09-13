import java.util.*;
public class userMap {
    private static HashMap<String, ArrayList<review>> userMap = new HashMap<String, ArrayList<review>>();

    public static HashMap<String,ArrayList<review>> getUserMap() {
         return userMap;
    }
}