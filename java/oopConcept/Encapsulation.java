package oopConcept;
import java.util.HashMap;
import java.util.Map;
interface Salaray {
    void salary(HashMap<String, Integer> answer);
    HashMap<String, Integer> programmingLanguage();
}
public class Encapsulation implements Salaray {
    @Override
    public HashMap<String, Integer> programmingLanguage() {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("Java", 100000);
        obj.put("Python", 20000);
        obj.put("C++", 3000);
        return obj;
    }
    @Override
    public void salary(HashMap<String, Integer> answer) {
        for (Map.Entry<String, Integer> entry : answer.entrySet()) {
            System.out.println("\nDeveloper Earn in "+entry.getKey());
            System.out.println("There Salaray is "+entry.getValue());
            } }public static void main(String args[]) {
        Encapsulation obj = new Encapsulation();
        HashMap<String, Integer> answer = obj.programmingLanguage();
        obj.salary(answer);
    }}
