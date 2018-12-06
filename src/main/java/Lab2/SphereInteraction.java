package Lab2;

public class SphereInteraction extends Sphere{

    private double SphereVolume1;
    private double SphereVolume2;

    private Circumference circ = new Circumference();

    public void volumeCalc(){
        double radius1 = circ.radiusInput();
        double radius2 = circ.radiusInput();

        this.SphereVolume1 = (4 * Math.PI * Math.pow(radius1, 3)) / 3;
        this.SphereVolume2 = (4 * Math.PI * Math.pow(radius2, 3)) / 3;
    }

    /**
     * This method could be effectuated without volume calculation
     * As the volume, according to formula, depends on radius only
     */
    private void checkIfSpheresMatch(){
        if ( SphereVolume1 > SphereVolume2 ){
            System.out.println("Second Sphere fits into the first one");
        } else if ( SphereVolume1 < SphereVolume2 ){
            System.out.println("First Sphere fits into the second one");
        } else {
            System.out.println("Spheres are of the same volume");
        }
    }

    public static void main(String[] args) {
        SphereInteraction test = new SphereInteraction();
        test.volumeCalc();
        test.checkIfSpheresMatch();
    }
}
