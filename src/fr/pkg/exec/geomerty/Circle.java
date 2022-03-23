package fr.pkg.exec.geomerty;

public class Circle {
    private static final double PI = 3.14159;  // Defines the pi value
    private double radius; // defines the radius of the circle

    // Defining a constructor
    public Circle(double r){
        this.radius = r;
    }

    // We calc using formula of circle  3.14 * r^2
    public double getArea(){
        return PI * radius * radius;
    }
    // We calc perimeter formula 2 * 3.14  * r
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
