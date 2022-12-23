package oopConcept;

public class ConditionExample {
    private String firstName;
    private String email;
    private String password;

    public String getFirstName() {
        return firstName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassword(String password) {
        if (password == "Java@123") {              //condition not match's
            this.password = password;
        } else {
            System.out.println("Sorry! enter  correct  password ");
        }
    }
    public void myInformation() {
        System.out.println(getFirstName() + "\n" + getEmail() + "\n" + getPassword());
    }
    public static void main(String[] args) {
        ConditionExample obj = new ConditionExample();
        obj.setFirstName("Java_Core_Tricks");
        obj.setEmail("Java1950@gamil.com");
        obj.setPassword("java@123");
        obj.myInformation();
        }
}
