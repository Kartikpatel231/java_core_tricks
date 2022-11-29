public class SingletonClassDemo {
    //static variable instance of type SingletonClassDemo
    private static SingletonClassDemo instance=null;
    //variable of type String
    public String text;
    //private constructor restricted to this class itself
    private SingletonClassDemo(){
        text="This is SINGLETON example";
    }
    public static SingletonClassDemo getInstance(){
        if(instance==null)
            instance=new SingletonClassDemo();
        return instance;
    }
}class SingletonText
{ public static void main(String[] args){
        //instantiating SingletonClassDemo class with variable first
        SingletonClassDemo first=SingletonClassDemo.getInstance();
        SingletonClassDemo second=SingletonClassDemo.getInstance();
        SingletonClassDemo third=SingletonClassDemo.getInstance();
        //modifying variable of instance first
        first.text=(first.text).toLowerCase();
        System.out.println("Value From First instance is :"+first.text);
        System.out.println("Value From Second instance is :"+second.text);
        System.out.println("Value From Third instance is :"+third.text);
        System.out.println("\n");
        }}
