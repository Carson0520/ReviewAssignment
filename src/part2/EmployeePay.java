
package part2;

import java.util.Scanner;


public class EmployeePay {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours;
        int employee = 0;
        double wage, pay, ot;
        for (int i = 0; i < 5; i++) {
            employee++;
        
        System.out.println("Enter hours worked for Employee " + employee + ": ");
        hours = s.nextInt();
        if (hours > 40 && hours < 70){
            pay = 40 * 15.00;
            ot = (hours - 40) * 22.50;
            wage = pay + ot;
            System.out.println("Regular pay $" + pay);
            System.out.println("Overtime pay $" + ot);
            System.out.println("Total pay $" + wage);
        }
        else if(hours > 0 && hours < 70){
            pay = hours * 15.00;
            System.out.println("Total pay $" + pay);
    }
        else
            System.out.println("Invalid, try again");
    }
    }
    
}
