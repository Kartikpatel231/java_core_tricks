package twoDimensionalArray;

public class ExceptionHandling {
    public static void main(String[] arr) {
        try {
            String Program[] = {"Java", "Python", "C++"};
            System.out.println(Program[7]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");

        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Follo Java_Core_Tricks");
    }
}
