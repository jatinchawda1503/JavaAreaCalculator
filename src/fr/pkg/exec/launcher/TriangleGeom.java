package fr.pkg.exec.launcher;

import fr.pkg.exec.geomerty.Triangle;

public class TriangleGeom {
    public static void main(String[] args){
        Triangle CalcArea = new Triangle(20, 30 , 40,14.5 );

        System.out.println("Triangle perimeter : " + CalcArea.getPerimeter() + ", area : " + CalcArea.getArea());
        System.out.println(" Calculating area and perimeter of Triangle  if we have given only 3 sides .perimeter : " + CalcArea.getPerimeter() + ", area : " + CalcArea.getAreaMethod2());
    }
}
