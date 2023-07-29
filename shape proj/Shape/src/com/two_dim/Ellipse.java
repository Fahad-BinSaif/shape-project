/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.two_dim;

/**
 *
 * @author Abdullah
 */
// Ellipse class (Two-dimensional shape)
public class Ellipse extends TwoDimensionalShape {

    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(String color, String creationDate, String borderStyle, double semiMajorAxis, double semiMinorAxis) {
        super(color, creationDate, borderStyle);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public String getDescription() {
        return "Ellipse: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
