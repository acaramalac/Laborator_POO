package Lab2;

import java.util.Scanner;

public class Circumference implements Dot {

    Circumference(){}

    private double radius;
    private double area;
    private double circumference;

    static Scanner sc = new Scanner(System.in);

    public double radiusInput(){
        System.out.print("Enter the radius: ");
        return radius = sc.nextDouble();
    }

    //Aria = PI*radius*radius
    public double areaCalc(){
        return area = Math.PI * (radius * radius);
    }

    //Circumferinta = 2*PI*radius
    public double circumferinceCalc(){
        return circumference = Math.PI * 2 * radius;
    }

    private void print(){
        System.out.println( "The area of the circle is: " + area);
        System.out.println( "The circumference of the circle is: " + circumference);
    }

    public static void main(String[] args) {
        Circumference test = new Circumference();
        test.radiusInput();
        test.areaCalc();
        test.circumferinceCalc();
        test.print();
    }
}
