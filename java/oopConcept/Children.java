package oopConcept;

public class Children extends Parants{
    String gender;

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("gender = "+gender);
        }
}
