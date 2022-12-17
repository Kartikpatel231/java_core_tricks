package oopConcept;
public class Polynomial {
    public String programingLanguage = "Java";
    public String name = "James Gosling";
    public void printInformation() {
        System.out.println(programingLanguage + "invented by = " + name);
    }
    public static class Polynomial1 extends Polynomial {
        @Override
        public void printInformation() {
            super.printInformation();
            programingLanguage = "Python";
            name = "Guido Van Rossum";
            System.out.println(programingLanguage + "invented by = " + name);
        }
    }
    public static class Polynomial2 extends Polynomial1 {
        @Override
        public void printInformation() {
            super.printInformation();
            programingLanguage = "C++";
            name = "Bjarne Stroustrup";
            System.out.println(programingLanguage + "invented by = " + name);
        }
    }public static void main(String[] args) {
        Polynomial obj2 = new Polynomial2();
        obj2.printInformation();
    }}
