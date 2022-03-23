package fr.pkg.exec.geomerty;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double breath;
    private double height;

    // Defining a constructor
    public Triangle(double a, double b, double c    , double h) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.height = h;

    }

    // Calc Area of Triangle
    public double getArea() {
        return 0.5 * sideC * height;
    }

    // Ref of formula : https://www.cuemath.com/measurement/area-of-triangle/
    public double getAreaMethod2() {
        if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA) {
            double s = (sideA + sideB + sideC) / 2;
            double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
            return  area;
        } else
        return 0;
    }


    // Calc perimeter
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }


}
