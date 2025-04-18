package org.example;

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public void displayType() {
        System.out.println("This is a circle (custom display).");
    }
}

