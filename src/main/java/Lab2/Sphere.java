package Lab2;

public class Sphere extends Circumference {

    Sphere(){}

    private double radius;

    public double radiusInput(){
        return this.radius = super.radiusInput();
    }

    //Volumul Sferei = 4/3 * Pi * r^3
    public void volumeCalc(){
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        System.out.println("Sphere volume is: " + volume);
    }

    public static void main(String[] args) {
        Sphere test = new Sphere();
        test.radiusInput();
        test.volumeCalc();
    }
}
