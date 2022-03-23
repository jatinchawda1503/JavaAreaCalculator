package fr.pkg.exec.launcher;

import fr.pkg.exec.geomerty.Circle;



public class Launcher {
    public static void main(String[] args) {

        Circle smallCircle = new Circle(20);
        Circle bigCircle = new Circle(60);

        System.out.println("Small circle perimeter : " + smallCircle.getPerimeter() + ", area : " + smallCircle.getArea());
        System.out.println("Big circle perimeter : " + bigCircle.getPerimeter() + ", area : " + bigCircle.getArea());




    }
}
