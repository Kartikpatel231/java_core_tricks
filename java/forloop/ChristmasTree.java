package forloop;
public class ChristmasTree{
 static void treeFunction(int width,int height) {
    int i, j, k, l, n = 1;
    int space = width * height;
    for (int x = 1; x <= height; x++) {
        for (i = n; i <= width; i++) {
            for (j = space; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        n = n + 2;
        width = width + 2;
    }
    for (i = 1; i <= height - 1; i++) {
        for (j = space - 3; j >= 0; j--) {
            System.out.print(" ");
        }
        for (k = 1; k <=height - 1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
       public static void main(String[] arg){
    System.out.println("---------Merry   Christmas-----------");
    treeFunction(5,3);
    }
}
