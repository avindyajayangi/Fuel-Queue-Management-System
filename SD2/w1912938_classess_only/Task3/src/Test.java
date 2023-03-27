import java.util.*;
public class Test {
    public static void main(String[] args) {

        try {
            int zero = 0;
            int x = 10/2;
            System.out.println(x);

        } catch (Exception error) {

            System.out.println("An error occurred");

        }



        Map<String, String> fruit = new HashMap<String,
                String>();
        fruit.put("Apple", "red");
        fruit.put("Pear", "yellow");
        fruit.put("Plum", "purple");
        fruit.put("Cherry", "red");
        for (String key : fruit.keySet()) {
            System.out.println(key + ": " +
                    fruit.get(key));
        }
    }
}

