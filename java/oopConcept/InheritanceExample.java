package oopConcept;

public class InheritanceExample {
    public static void main(String args[]) {
        Parants obj = new Parants();
        obj.name = "Jethalal & Daya (Gada)";
        obj.age = 45;
        obj.address = "GokulDham";
        obj.printInformation();
        System.out.println("      \n   Inheritance Example   \n");
        Children obj1 = new Children();
        obj1.name = "Tipendra Jethalal Gada";
        obj1.gender = "Male";
        obj1.age = 23;
        obj1.address = "Mumbai";
        obj1.printInformation();

    }
}
