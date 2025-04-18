package org.example;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(5.5);  // Polymorphism

        shape.draw();                   // Calls overridden method
        System.out.println("Area: " + shape.getArea());

        shape.displayType();            // Calls overridden default method
    }
}
