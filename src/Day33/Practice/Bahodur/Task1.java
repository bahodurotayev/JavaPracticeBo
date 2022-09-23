package Day33.Practice.Bahodur;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> errorCodes = new HashMap<>();
        errorCodes.put(200, "OK");
        errorCodes.put(201, "Created");
        errorCodes.put(202, "Accepted");
        errorCodes.put(203, "Non-Authoritative Information");
        errorCodes.put(204, "No Content");

        for (Integer value: errorCodes.keySet()) {

            if(errorCodes.get(value).equals("Accepted")){
                errorCodes.replace(value, "Confirmed");
            }
        }
        System.out.println(errorCodes);

        for (Integer value2: errorCodes.keySet()) {
            errorCodes.replace(value2, errorCodes.get(value2).toUpperCase());
        }
        System.out.println(errorCodes);

        for (Map.Entry<Integer, String> value: errorCodes.entrySet()) {
            System.out.println(value.getKey());
        }
    }
}
