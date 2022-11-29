
//Teacher Class but we not created object

public class Teacher {
    private String name;
    private String subject;
    private double salary;
    private String phoneNumber;

    public Teacher(String name, String subject, double salary, String phoneNumber) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        System.out.println("Teacher  = "+name+" "+subject+" "+salary+" "+phoneNumber);
    }
}
