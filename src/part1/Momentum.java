package part1;

import java.util.Scanner;

public class Momentum {


    public static void main(String[] args) {
        double momentum, mass, velocity;
        
        Scanner s = new Scanner(System.in);
        
        //ask for mass and velocity
        System.out.println("Enter object's mass (in kg) --> ");
        mass = s.nextDouble();
        System.out.println("Enter objects velocity (in m/s) --> ");
        velocity = s.nextDouble();
        
        //calculate momentum
        momentum = mass * velocity;
        
        //print the answer
        System.out.println(String.format("The objects momentum is %.2f", momentum));
        System.out.println("Program Ended");
        
        
    }
    
}
