package recursion;

import java.util.Arrays;

public class RemoveCharacter {
    public static String remove(char[] ch, int size, char remove) {
        if (size == 0) {
            return "";
        }
            // Call remove recursively for the first size-1 characters
        String result = remove(ch, size - 1, remove);
            // Check if the last character is to be removed
        if (ch[size - 1] == remove) {
            // If yes, return the result without the last character
            return result;
        } else {
            // If no, append the last character to the result and return
            return result + ch[size - 1];
        }
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(ch));
        int size = ch.length;
        String str = remove(ch, size, 'a');
        System.out.println(str);
    }
}
