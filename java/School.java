
//School Class but we not created object

public class School{
     private String name;
     private String address;
     private int phoneNumber;
     private int sections;

    public School(String name, String address, int phoneNumber, int sections) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sections = sections;
        System.out.println("School  = "+name+" "+address+""+phoneNumber+"  "+sections);
    }
}