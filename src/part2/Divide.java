
package part2;

import java.util.Scanner;


public class Divide {


    public static void main(String[] args) {
        int num1, num2;
        int nums = 0, numb = 0,total = 0, totalmod = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = s.nextInt();
        System.out.println("Enter number 2");
        num2 = s.nextInt();
        
       if (num2 > num1){
           total = num1 / num2;
           totalmod = num1 % num2;
       }
       else if (num1 > num2){
           total = num1 / num2;
           totalmod = num1 % num2;
       }
        System.out.println("Your answer is " + total + " r" + totalmod);

}
    
}
