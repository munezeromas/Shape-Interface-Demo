package org.example;
interface Shape {
    double getArea();
    void draw();

    default void displayType() {
        System.out.println("This is a shape.");
    }
}

