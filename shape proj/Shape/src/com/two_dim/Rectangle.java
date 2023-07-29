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
// Rectangle class (Two-dimensional shape)
public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle(String color, String creationDate, String borderStyle,double length, double width) {
        super(color, creationDate, borderStyle);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public String getDescription() {
        return "Rectangle: Color=" + super.color + ", Creation Date=" + super.creationDate + ", Border Style=" + super.borderStyle;
    }
}
