package recursion;

public class SubString1 {
    public static void subString(String str) {
        if (str.length() == 0) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        subString(str);
    }
}
