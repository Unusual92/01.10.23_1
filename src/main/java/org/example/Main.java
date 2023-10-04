package org.example;

public class Main {
    public static void main(String[] args) {
        Shape cube = new Cube(5);
        System.out.println(cube.getVolume());

        Shape pyramid = new Pyramid(6, 4);
        System.out.println(pyramid.getVolume());
    }
}