package fr.pkg.exec.launcher;

import fr.pkg.exec.geomerty.Square;
import fr.pkg.exec.geomerty.Triangle;

public class SquareGeom {
    public static void main(String[] args){
        Square CalcArea = new Square(10,10 );

        System.out.println("Triangle perimeter : " + CalcArea.getPerimeter() + ", area : " + CalcArea.getArea());

    }
}
