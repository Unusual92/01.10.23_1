package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Cube implements Shape {
    private final double length;

    @Override
    public double getVolume() {
        return Math.pow(length, 3);
    }
}