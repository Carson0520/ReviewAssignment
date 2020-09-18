
package part2;

import java.util.Scanner;

class PowerChart {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, ans;
        System.out.println("Enter your number --> ");
        num = s.nextInt();
        for (int i = 0; i <= num; i++) {
            ans = (int) (Math.pow(2, i));
            System.out.println("2^" + i + " = " + ans);
        }
        
    }
    
}

