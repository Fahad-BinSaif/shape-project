package com.two_dim;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
// Square class (Two-dimensional shape)
public class Square extends TwoDimensionalShape {

    private double side;

    public Square(String color, String creationDate, String borderStyle, double side) {
        super(color, creationDate, borderStyle);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getDescription() {
        return "Square: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
