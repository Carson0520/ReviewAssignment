
package part1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;
import BreezySwing.*;

public class BarChart {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SketchPadWindow spw = new SketchPadWindow (800,600);
        Pen p = new StandardPen (spw);
        
        
        int b1,b2,b3,b4;
        
        System.out.println("Input number 1");
        b1=s.nextInt();
        System.out.println("Input number 2");
        b2=s.nextInt();
        System.out.println("Input number 3");
        b3=s.nextInt();
        System.out.println("Input number 4");
        b4=s.nextInt();
        
        makeBar(p, -200, -250, b1, Color.blue);
        makeBar(p, -100, -250, b2, Color.red);
        makeBar(p, 0, -250, b3, Color.green);
        makeBar(p, 100, -250, b4, Color.orange);
        p.up();
        p.move(400,-250);
        p.setColor(Color.black);
        p.down();
        p.move(-400,-250);
       
        
    }
    
    public static void makeBar(Pen p, int xloc, int yloc, int length, Color col){
p.up();
p.move(xloc, yloc);
p.down();
p.setWidth(15);
p.setColor(col);
p.setDirection(90);
p.move(length);
p.up();
p.move(15);
p.down();
p.drawString(length + "");
}
}


