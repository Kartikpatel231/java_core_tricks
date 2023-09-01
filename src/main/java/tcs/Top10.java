package tcs;
public class Top10 {
    // Function to calculate the factorial of a number
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
    // Function to check if a number is a strong number
    public static boolean isStrongNumber() {
        int number = 145;
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        System.out.println("To check given Number is Strong number");
        boolean flag3 = isStrongNumber();
        System.out.println(flag3);
    }
}


