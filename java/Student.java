
//Student Class but we not created object

public class Student {
    private String name;
    private int section;
    private String address;
    private String phoneNumber;

    public Student(String name, int section, String address, String phoneNumber) {
        this.name = name;
        this.section = section;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("Student  = "+name+" "+section+" "+address+" "+phoneNumber);
    }

}
