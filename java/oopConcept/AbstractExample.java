package oopConcept;
abstract class OperatingSystem {
    void apple() {
        System.out.println("This is Operating System");
        String name = "Apple macOS";
        System.out.println(name);
    }
    abstract void microsoft();
    abstract void linux();
}
public class AbstractExample extends OperatingSystem {
    void microsoft() {
        String name = "Microsoft Windows";
        System.out.println(name);
    }
    void linux() {
        String name = "Linux Operating System";
        System.out.println(name);
    }
    public static void main(String[] args) {
        OperatingSystem obj = new AbstractExample();
        obj.apple();
        obj.microsoft();
        obj.linux();
    }
}
