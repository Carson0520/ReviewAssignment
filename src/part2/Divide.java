
package part2;

import java.util.Scanner;


public class Divide {


    public static void main(String[] args) {
        int num1, num2;
        int nums = 0, numb = 0,answer = 0, answermod = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1");
        num1 = s.nextInt();
        System.out.println("Enter number 2");
        num2 = s.nextInt();
        
        if (num2 > num1){
            num2 = nums;
            num1 = numb;
            answer = numb / nums;
            answermod = numb % nums;
            System.out.print("Answer is " + answer + " r" + answermod);       }
    }
    
}
