package JavaQustions;

public class GetSub {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);  // Initialize smallest substring with the first substring of length 'k'
        String largest = s.substring(0, k);   // Initialize largest substring with the first substring of length 'k'

        // Iterate through the remaining substrings of length 'k' in the input string 's'
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);  // Get the current substring

            // Compare the current substring with the smallest substring found so far
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;  // Update the smallest substring if the current substring is smaller
            }

            // Compare the current substring with the largest substring found so far
            if (substring.compareTo(largest) > 0) {
                largest = substring;  // Update the largest substring if the current substring is larger
            }
        }
        return smallest + "\n" + largest;  // Return the smallest and largest substrings separated by a newline character
    }
    public static void main(String[] args){
        String str="JavaCoreTricks";
        String ans=getSmallestAndLargest(str,5);
        System.out.print(ans);
    }
}