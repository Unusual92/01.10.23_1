package org.example;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Pyramid implements Shape {
    private final double baseLength;
    private final double height;

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * baseLength * baseLength * height;
    }
}