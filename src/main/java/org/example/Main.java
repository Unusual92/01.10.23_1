package org.example;

public class Main {
    public static void main(String[] args) {
        Shape cube = new Cube(5);
        System.out.println(cube.getVolume());

        Shape pyramid = Pyramid.builder().baseLength(6).height(4).build();
        System.out.println(pyramid.getVolume());
    }
}
