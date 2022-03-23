package fr.pkg.exec.geomerty;

public class Square extends Quadrilateral{


    public Square(double w, double h) {
        super(w, h);
    }

    public double getArea() {
        return width * height;
    }
    // Calc perimeter
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
