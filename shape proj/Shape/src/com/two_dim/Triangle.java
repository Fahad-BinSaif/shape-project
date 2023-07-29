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
// Triangle class (Two-dimensional shape)
public class Triangle extends TwoDimensionalShape {

    private double base;
    private double height;

    public Triangle(String color, String creationDate, String borderStyle, double base, double height) {
        super(color, creationDate, borderStyle);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getDescription() {
        return "Triangle: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
