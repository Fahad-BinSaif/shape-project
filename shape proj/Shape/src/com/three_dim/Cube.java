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
// Cube class (Three-dimensional shape)
public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube(String color, String creationDate, String borderStyle, double side) {
        super(color, creationDate, borderStyle);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String getDescription() {
        return "Cube: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
