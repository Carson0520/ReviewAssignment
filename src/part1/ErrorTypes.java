/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author cars0520
 */
public class ErrorTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        3 types of errors: Syntax, Runtime, logic
        */
    
    //syntax --> type error, program wont run
    //int x = 45   //needs ";"
    
    //runtime --> progra starts but crashes or throws error
    //can be avoided by using try / catch
    Scanner s = new Scanner(System.in);
    
    int candy = 100;
    int howmany, eachgets;
        System.out.println("How many people are you giving candy tp? --> ");
        howmany = s.nextInt();
        try{
                  eachgets = candy / howmany;
        } catch (Exception e){
            System.out.println("You are too greedy, you lost all candies");
            return;
        }

        System.out.println("Each person gets " + eachgets);
        
    //logic error --> program runs, never crashes but does not do what it should
    //hardest type of error to detect because compiler never complains
    
    System.out.print("Enter wage / hr --> ");
    double wage = s.nextDouble();
        System.out.println("Enter hours worked --> ");
        double hours = 0;
        double pay = wage + hours; //error, should be wage + hours
        System.out.println("Your pay is $" + pay);
    }
    

    
}
