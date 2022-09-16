import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> Mapp = new HashMap<>();

        Mapp.put("One Key", "One Value");
        Mapp.put("Two Key", "Two Value");

        for (Map.Entry<String,String> entry : Mapp.entrySet()){
            System.out.println("Key = " + entry.getKey() + " , value = " + entry.getValue());
        }
    }


}