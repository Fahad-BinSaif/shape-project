package com.three_dim;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
// Sphere class (Three-dimensional shape)
public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(String color, String creationDate, String borderStyle, double radius) {
        super(color, creationDate, borderStyle);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Sphere: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
