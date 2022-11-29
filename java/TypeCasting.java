public class TypeCasting {
    String mysum="45";
    int a= Integer.parseInt((String)mysum);
    double b=45.3;
    float c=(float)b;
    public void display() {
        System.out.println("Original number");
        System.out.println(mysum);
        System.out.println("Type casting in integer");
        System.out.println(a+a);
        System.out.println("Double converted in float");
        System.out.println(b);
        System.out.println("Type casting in float");
        System.out.println(c);

    }
    public static void main(String[] args){
        TypeCasting obj=new TypeCasting();
        obj.display();
    }
}
