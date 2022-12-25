package oopConcept;
public class Constructor {
    String name = "Virat";
    int age = 35;

    public Constructor() {                     //default explicit Constructor
        System.out.println("\n Default Constructor");
        System.out.println("Your name" + name);
        System.out.println("Your age" + age);
    }
    public Constructor(String name, int age) {  //parameter Constructor;
        this.name = name;
        this.age = age;
        System.out.println("\n This is parameter Constructor");
        System.out.println("Your name =" + name);
        System.out.println("Your age =" + age);
    }
    public Constructor(Constructor obj1) {                 //copy Constructor
        this.name=obj1.name;
        this.age=obj1.age;
        System.out.println("\n This is copy constructor");
        System.out.println("Your name = "+obj1.name);
        System.out.println("Your age = "+obj1.age);
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor("kartik", 25);
        Constructor obj2=new Constructor(obj1);

    }
}
