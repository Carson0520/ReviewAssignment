
package part1;

import java.util.Scanner;


public class PizzaCost {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labor = 1.5;
        final double heat = 0.75;
        double size;
        int numt;
        
        //ask for pizza size in inches
        System.out.println("Enter pizza in inches");
        size = s.nextDouble();
        //ask for how many toppings
        System.out.println("Enter number of toppings");
        numt = s.nextInt();
        
        //calculate
        double total;
        total = labor + heat + (size * 0.50) + (numt * 0.75);
        System.out.println("Your pizza will cost $" + total);
    }
    
}
