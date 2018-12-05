package Lab1;

import java.util.Scanner;

public class QuadricEquation {

    private static int a;
    private static int b;
    private static int c;
    private double temp1;

    private QuadricEquation(){} //implicit constructor

    /**
     * Constructori cu parametri
     */
    public QuadricEquation(double a){}

    public QuadricEquation(double a, double b){}

    public QuadricEquation(double a, double b, double c){}


    /**
     * constructor de copiere, copiaza variabilele membre in obiectul
     * curent
     */
    public QuadricEquation(QuadricEquation lolQuadricEquation){

        this.a = lolQuadricEquation.a;
        this.b = lolQuadricEquation.b;
        this.c = lolQuadricEquation.c;
        this.temp1 = lolQuadricEquation.temp1;
    }

    private void equationCalc_1(int a, int b, int c){

        temp1 = Math.sqrt((Math.pow(b, 2)) - 4 * a * c );

    }

    private void rootCalc(){
        double root1 = (-b + temp1) / (2 * a);
        double root2 = (-b - temp1) / (2 * a);

        System.out.println("Square roots are: " + root1 + " and " + root2);
    }


    private void scanner(){
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }

    private void print(){
        System.out.println("Square root is: " + temp1);
        rootCalc();
    }

    public static void main(String[] args) {
        QuadricEquation test = new QuadricEquation();
        test.scanner();
        test.equationCalc_1(a, b, c);
        test.print();
    }
}
