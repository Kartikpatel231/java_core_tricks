package LambdaExpression;

public class Method {
    public int getArea(int width, int height) {
        return width * height;
    }
    public static void main(String[] args) {
        Method obj = new Method();
        int sum = obj.getArea(5, 5);
        System.out.println("Area of triangle = "+sum);
    }
}
