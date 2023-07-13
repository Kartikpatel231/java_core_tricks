package JavaQustions;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        System.out.println("enter number = ");
        int n = scanner.nextInt();
        // Solve the problem
        int answer = solveProblem(n);
        // Print the answer
        System.out.println("sum of number ="+answer);
        scanner.close();
    }
    public static int solveProblem(int n) {
        int result = 0;
        // Iterate from 1 to n
        for (int num = 1; num <= n; num++) {
            // Check if the number is divisible by 3 or 5
            if (num % 3 == 0 || num % 5 == 0) {
                result =result + num;
            }
        }
        return result;
    }
}
