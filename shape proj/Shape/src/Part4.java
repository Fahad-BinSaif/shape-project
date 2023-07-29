/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah
 */
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Mammal extends Animal {
    protected String furColor;
    
    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    
    public void giveBirth() {
        System.out.println(name + " is giving birth to live young.");
    }
}

class Cat extends Mammal {
    public Cat(String name, int age, String furColor) {
        super(name, age, furColor);
    }
    
    public void meow() {
        System.out.println(name + " says meow.");
    }
}

class Dog extends Mammal {
    public Dog(String name, int age, String furColor) {
        super(name, age, furColor);
    }
    
    public void bark() {
        System.out.println(name + " says bark.");
    }
}

