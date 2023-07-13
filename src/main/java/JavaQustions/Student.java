package JavaQustions;

import java.util.ArrayList;
public class Student {
    private Long id;
    private String userName;
    private String password;
    private int age;
//student Class constructor with parameter
    Student(Long id, String userName, String password, int age) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }
    public String toString() { //jvm automatically execute toString()
        return "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age;
    }
//pass value in Dynamic Array ArrayList it is dynamic in nature
    public static ArrayList<Student> printValue() {
        ArrayList<Student> obj = new ArrayList<>(5);
        obj.add(new Student(1L, "kartik", "kartik@123", 21));
        obj.add(new Student(2L, "Hariom", "Hariom@123", 19));
        obj.add(new Student(3L, "Mayur", "kartik@123", 22));
        return obj;
    }
//update value using ArrayList inbuilt method set()
    public static ArrayList<Student> updateValue(ArrayList<Student> obj) {
        obj.set(1, new Student(2L, "updatedValue", "kartik@123", 20));
        return obj;
    }
//delete value using ArrayList inbuilt method remove();
    public static ArrayList<Student> deleteValue(ArrayList<Student> obj) {
        obj.remove(1);
        return obj;//return ArrayList Student Class Object
    }

    public static void main(String[] args) {
        ArrayList<Student> credential = printValue();
        credential.forEach(obj -> System.out.println(obj));
        //iterate using for each loop in java & lambda Expression
        System.out.println("update value at index 2");
        ArrayList<Student> update = updateValue(credential);
        update.forEach(obj1 -> System.out.println(obj1));

        System.out.println("Delete value at index 2");
        ArrayList<Student> delete = deleteValue(update);
        delete.forEach(obj2 -> System.out.println(obj2));
    }
}

