package twoDimensionalArray;

public class SumOfBoundaray {
    public static int printFistDiagonal(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int sumOfFistDiagonal = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sumOfFistDiagonal = sumOfFistDiagonal + arr[i][j];
                }
            }
        }
        System.out.println("FirstDiagonalSum = " + sumOfFistDiagonal);
        return sumOfFistDiagonal;
    }
    public static int printSecondDiagonal(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int sumOfSecondDiagonal = 0;
        for (int i = row; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sumOfSecondDiagonal = sumOfSecondDiagonal + arr[i][j];
                }
            }
        }
        System.out.println("SecondDiagonalSum = " + sumOfSecondDiagonal);
        return sumOfSecondDiagonal;
    }
    public static int boundaraySum(int arr[][]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            sum = sum + arr[0][i]; //upperSide;
            sum = sum + arr[n - 1][i];//lower side;
            sum = sum + arr[i][0];  //left side;
            sum = sum + arr[i][n - 1];//right side;
        }
        System.out.println("Boundary sum = " + sum);
        return sum;
    }
    public static void totalSum(int arr[][]) {
        int n = arr.length;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int totalSum = printFistDiagonal(arr) + printSecondDiagonal(arr) + boundaraySum(arr);
        if (n % 2 != 0) {
            totalSum = totalSum - arr[n / 2][n / 2];
        }
        System.out.println("Total Sum Of N*N Matrix is="+totalSum);
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printFistDiagonal(arr);
        printSecondDiagonal(arr);
        boundaraySum(arr);
        totalSum(arr);
    }
}
