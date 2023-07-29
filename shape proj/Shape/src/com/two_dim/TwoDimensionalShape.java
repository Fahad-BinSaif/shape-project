package com.two_dim;

import com.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(String color, String creationDate, String borderStyle) {
        super(color, creationDate, borderStyle);
    }

    public abstract double getArea();
}
