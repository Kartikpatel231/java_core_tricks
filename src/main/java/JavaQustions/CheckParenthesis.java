package JavaQustions;
import java.util.HashMap;
import java.util.Stack;
public class CheckParenthesis {
    public static boolean isValid(String str) {
        int n = str.length();
        HashMap<Character, Character> obj = new HashMap<>();
        obj.put('}', '{'); //put all parenthesis in hashMap
        obj.put(')', '('); //key value pair
        obj.put(']', '[');
        Stack<Character> stack = new Stack<>();//stack memory
        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);//get each character

            if (obj.containsValue(currentChar)) {//push in stack
                stack.push(currentChar);
            } else if (obj.containsKey(currentChar)) {//check key present or not
                if (stack.isEmpty() || stack.pop() != obj.get(currentChar)) {
                    return false;  //check stack is empty or not,pop element
                }
            }
        }return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{()[]}";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
}
