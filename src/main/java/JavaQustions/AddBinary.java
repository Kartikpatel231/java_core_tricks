package JavaQustions;

public class AddBinary {
    public static String addBinary(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int len1 = s1.length() - 1;
        int len2 = s2.length() - 1;
        int carry = 0;
        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            int sum = carry;
            if (len1 >= 0) {
                sum += s1.charAt(len1--) - '0';
            }
            if (len2 >= 0) {
                sum += s2.charAt(len2--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
            }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String b1 = "11111";
        String b2 = "11111";
        String result = addBinary(b1, b2);
        System.out.println("sum of Two binaray :" + result);
    }
}
