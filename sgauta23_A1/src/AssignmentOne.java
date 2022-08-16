import java.util.ArrayList;
import java.util.function.Predicate;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 2 – Using abstract classes and interfaces
        Laptop newLaptop = new Laptop();
        Laptop newLaptop1 = new Laptop(2000, 7, "Apple", true);
        newLaptop1.printMethod();
        System.out.println("------------------------------");
        // Part 3 – Polymorphism
        // The polymorphism is basically the ability to process objects differently on the basis of their class and data
        // type. In these codes for polymorphism we create a subclass Laptop from the parent class Computer and in this
        // process the feels and methods from the parent class is carried over to the child class. So we can see below
        // that the webSearch is an abstract method in the Computer class which does not have body and does not print
        // anything but the same method when accessed from Laptop class it overrides the functionality and does use the
        // print function to display the message.
        DemonstratePolymorphism(new Laptop());
        System.out.println("------------------------------");
        // Part 4 – Generic classes
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(1200, 2, "Lenovo", true));
        laptops.add(new Laptop(3000, 7, "Alienware", false));
        laptops.add(new Laptop(1800, 3, "HP", true));
        laptops.add(new Laptop(2100, 5, "Dell", false));
        laptops.add(new Laptop(2500, 5, "Microsoft", true));
        System.out.println("------------------------------");
        // Part 5 - Generic methods
        System.out.println("------------------------------");
        // Part 6 - Wildcards
        //The wildcards in this code is used in the DemonstrateWildcards method by using ? as a type parameter of an
        // unknown generic type parameter which helps to call a list of whatever we want from the Array list. Here the
        // list of cost is shown from the created objects in the Array. The list of any other generic type can also be
        // called from the Array list by using the same method signature.
        DemonstrateWildcards(laptops);
        System.out.println("------------------------------");
        // Part 7 - Simple lambda expressions
        DemonstrateLambdas(laptops,laptop -> laptop.isAvailable);
        System.out.println("------------------------------");
    }
    public static void DemonstratePolymorphism(Computer computer){
        computer.webSearch();
        }
    public static <T> void DemonstrateWildcards (ArrayList<? extends Computer> arrs){
        for (Computer values:arrs) {
            System.out.println(values.getCost());
        }
    }
    public static void DemonstrateLambdas (ArrayList <Laptop> array1, Predicate <Laptop> laptopPredicate){
        for (Laptop list: array1){
         if (laptopPredicate.test(list)){
             System.out.println(list.companyName + " is available on store.");
         }else{
             System.out.println(list.companyName + " is not available on store.");
         }
        }
    }
}
