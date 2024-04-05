package org.howard.edu.lsp.hw5;
import java.util.ArrayList;


public class Driver {
    public static void main(String[] args) {
        // Creating IntegerSet instances
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        // Adding elements to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        // Adding elements to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        // Printing the contents of set1
        System.out.println("Value of Set1 is: " + set1.toString());
        
        // Finding the smallest and largest values in set1
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());
        
        // Printing the contents of set2
        System.out.println("Value of Set2 is: " + set2.toString());
        
        // Performing union operation on set1 and set2
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
    }
}
