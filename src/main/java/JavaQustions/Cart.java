package JavaQustions;

import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    private int id;
    private String productName;
    private Double price;
    private int quantity;

    //default constructor required to create Cart object
    public Cart() {
    }

    //parameterised constructor contain class variable
    Cart(int id, String product, Double price, int quantity) {
        this.id = id;
        this.productName = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {     //Java - toString() Method
        return "product_id = " + id + ", name = " + productName +
                ", price = " + price + ", quantity = " + quantity;
    }

    public Cart[] passValue(Cart arr[]) { //taking CartArray in method
        Scanner sc = new Scanner(System.in); //input from user
        System.out.println("productName,price,quantity"); //input this values
        for (int i = 0; i < arr.length; i++) {  //run until array size will not end
            System.out.println("enter the value at cart" + i);
            id = i; //increase automatically we initially with i
            productName = sc.next();
            price = sc.nextDouble();
            quantity = sc.nextInt();
            arr[i] = new Cart(id, productName, price, quantity); //collect value in array
        }
        return arr; //return array
    }


    //remove element from cart
    public String removeValue(Cart arr[], int id) {
        for (int i = 0; i < arr.length; i++) { //iterate to cart to find id
            if (arr[i].id == id) { //check condition if id match we enter in if case
                for (int j = i; j < arr.length - 1; j++) { //run another loop to shift element
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = null; // set last element to null
                break;
            }
        }
        return "successfully deleted";
    }
    //update element from cart
    public String updateValue(Cart arr[], int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].id == id) {
                Scanner sc = new Scanner(System.in);
                //add this line to prompt user to enter the updated values
                System.out.println("productName,price,quantity");
                String productName = sc.next();
                Double price = sc.nextDouble();
                int quantity = sc.nextInt();
                //create a new Cart object with updated values
                arr[i] = new Cart(id, productName, price, quantity);
                //return statement should be inside the if block
                return "successfully updated";
            }
        }
        return "cart not found";
    }





    public static void main(String[] args) {
        Cart obj = new Cart();
        Scanner sc = new Scanner(System.in); //take scanner class for user input
        System.out.println("enter the size of cart"); //give size to an array
        int n = sc.nextInt();
        Cart arr[] = new Cart[n]; //declare an array with user input size
        Cart cartValues[] = obj.passValue(arr);   //method to get list of cart
        for (Cart value : cartValues) {        //iterate each value
            System.out.println(value);

        }
        //remove element from given id
        String rm = obj.removeValue(arr, 1);
        System.out.println(rm);
        System.out.println(Arrays.toString(arr));
        //update element from given id
        String up = obj.updateValue(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
