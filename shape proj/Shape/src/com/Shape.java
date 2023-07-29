package com;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public abstract class Shape {

    protected String color;
    protected String creationDate;
    protected String borderStyle;

    public Shape(String color, String creationDate, String borderStyle) {
        this.color = color;
        this.creationDate = creationDate;
        this.borderStyle = borderStyle;
    }

    public abstract String getDescription();
}
