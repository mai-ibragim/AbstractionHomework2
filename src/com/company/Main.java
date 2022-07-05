package com.company;

public class Main {

    public static void main(String[] args) {
       Trapezoid trapezoid = new Trapezoid();
        System.out.println("Perimeter of a trapezoid: " + trapezoid.getPerimeter());

        Quadrilateral quadrilateral = new Quadrilateral();
        System.out.println("Perimeter of a quadrilateral: " + quadrilateral.getPerimeter());

        Rhombus rhombus = new Rhombus();
        System.out.println("Perimeter of a rhombus: " + rhombus.getPerimeter());

        Square square = new Square();
        System.out.println("Perimeter of a square: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println("Perimeter of a rectangle: " + rectangle.getPerimeter());
    }
}
