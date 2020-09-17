
package part2;

import java.text.NumberFormat;


public class SalaryTable {


    public static void main(String[] args) {
        /*
        Barrie's sal in 2020 is 160000
        grows by 6% every 10 years
        How much will it be in 2120
        */
        int sal = 40000;
        int raise;
        NumberFormat nf = NumberFormat.getNumberInstance();
        //can alsoe use currency and %
        
        //print column headings
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%15s", "RAISE");
        System.out.format("%20s\n", "NEW SALARY");
        
        System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "=====");
        System.out.format("%20s\n", "==========");
        
        for (int year = 1; year <= 10; year++) {
            System.out.format("%5d", year);
            System.out.format("%20s", nf.format(sal));
            raise = (int)(.03 * sal); //have to cast integer
            System.out.format("%15s", nf.format(raise));
            sal += raise;
            System.out.format("%20s\n", nf.format(sal));
            
        }
    }
    
}
