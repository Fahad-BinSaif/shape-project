package com.three_dim;

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
public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(String color, String creationDate, String borderStyle) {
        super(color, creationDate, borderStyle);
    }

    public abstract double getArea();

    public abstract double getVolume();
}
