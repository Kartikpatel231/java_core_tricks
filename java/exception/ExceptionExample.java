package exception;

public class ExceptionExample {
    static String name="Java";
    public int name(String myName) {
        try{
        name=name;
            System.out.println(name);

    }catch (Exception e){
            System.out.println("String only");
        }
        finally {
            System.out.println("finally block always execute");
        }
        return 0;
        }
    public static void main(String[] args){
        ExceptionExample obj=new ExceptionExample();
        obj.name("ram");
    }
}
