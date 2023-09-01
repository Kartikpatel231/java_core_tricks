package tcs;

import java.util.HashMap;

public class Coding2 {
    public static void main(String[] args) {

            String a = "tiger";
            String b = "ti";
            HashMap<Character, Integer> obj = new HashMap<>();

            for (int i = 0; i < a.length(); i++) {
                obj.put(a.charAt(i), i);
            }

            for (int j = 0; j < b.length(); j++) {
                char ch = b.charAt(j);
                if (obj.containsKey(ch)) {
                    obj.remove(ch);
                }
            }

            String c = "";
            for (int j = 0; j < a.length(); j++) {
                if (obj.containsKey(a.charAt(j))) {
                    c = c + a.charAt(j);
                }
            }

            System.out.println(c);
        }
    }
