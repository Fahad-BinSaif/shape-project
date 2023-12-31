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
// Circle class (Two-dimensional shape)
public class Circle extends TwoDimensionalShape {

    private double radius;

    public Circle(String color, String creationDate, String borderStyle, double radius) {
        super(color, creationDate, borderStyle);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Circle: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
