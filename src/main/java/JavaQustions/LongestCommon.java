package JavaQustions;

public class LongestCommon {
    public static String longestCommonPrefix(String[] strs) {
        // Check if the input array is null or empty
        if (strs == null || strs.length == 0)
            return "";
        // Initialize prefix with the first string in the array
        String prefix = strs[0];
        // Iterate over the remaining strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Check if the current string does not start with the current prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by removing the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                // Check if prefix becomes empty
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] input1 = {"flower", "flow", "flight"};
        String result1 = longestCommonPrefix(input1);
        System.out.println("Longest common prefix: " + result1);

    }
}
