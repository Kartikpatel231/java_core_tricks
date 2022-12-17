package oopConcept;

public class Vehicle{
   public String name;           //Public access Modifier
   protected String company;   //Protected access Modifier
   private double price;     //private access Modifier
   String color;          //default access Modifier
   public double Vehicle(double price){
       this.price=price;
       return price;
   }
   public void printDescriptions(double price){
       System.out.println("carName = "+name+"\ncompanyName = "+company+
                         "\nprice = "+price+"\ncolor = "+color);
   }
    public static void main(String[] args){
         Vehicle obj=new Vehicle();
         obj.color="red";
         //obj.price=3570000;
         obj.company="Jaguar Land Rover";
         obj.name="Range Rover";
        double ans= obj.Vehicle(3333);
        obj.printDescriptions(ans);
    }
}
