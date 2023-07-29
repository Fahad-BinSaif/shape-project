/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.three_dim;

/**
 *
 * @author Abdullah
 */
// Cylinder class (Three-dimensional shape)
public class Cylinder extends ThreeDimensionalShape {

    private double radius;
    private double height;

    public Cylinder(String color, String creationDate, String borderStyle, double radius, double height) {
        super(color, creationDate, borderStyle);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String getDescription() {
        return "Cylinder: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }

}
