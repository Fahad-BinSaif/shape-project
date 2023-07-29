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
// Tetrahedron class (Three-dimensional shape)
public class Tetrahedron extends ThreeDimensionalShape {

    private double side;

    public Tetrahedron(String color, String creationDate, String borderStyle, double side) {
        super(color, creationDate, borderStyle);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return (Math.sqrt(2) / 12) * side * side * side;
    }

    @Override
    public String getDescription() {
        return "Tetrahedron: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
