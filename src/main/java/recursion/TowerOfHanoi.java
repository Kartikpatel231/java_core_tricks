package recursion;

public class TowerOfHanoi {
    public static void arrange(int n, char source, char destination, char helper) {
        if (n == 0) {
            return;
        }
        arrange(n - 1, source,helper,destination);
        System.out.println("Moving disk " + n + " from "+ source + " to " + destination);
        arrange(n - 1, helper, destination, source);
    }

    public static void main(String[] args) {
        int n = 3;

        arrange(n, 'A', 'C', 'B');
    }

}
