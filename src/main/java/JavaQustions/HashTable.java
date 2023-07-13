package JavaQustions;
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTable {
    public static void main(String[] args) {
        Enumeration<Integer> birds;
        Integer key;
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put(1, "Pigeon");
        hashtable.put(2, "BlueBird");
        hashtable.put(3, "Swan");
        hashtable.put(4, "Parrot");
        hashtable.put(4, "Sparrow");
        //iterate using forEach loop in Java
        hashtable.forEach((k, v) ->
                System.out.println("Key: " + k + " & Value: " + v));
     //iterate using enumeration in java
        System.out.println("\n Using Enumeration");
        birds = hashtable.keys();
        while (birds.hasMoreElements()) {
            key = birds.nextElement();
            System.out.println("Key: " + key + " & Value: " +
                    hashtable.get(key));
        }
    }
}
