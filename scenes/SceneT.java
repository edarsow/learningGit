/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenes;

/**
 * Class which demonstrates converting a scene in an image to
 * Java code using object-oriented principles
 * @author edarsow
 */
public class SceneT {
    public static void main(String[] args) {
        // make a creature object
        Creature turtle = new Creature();
        // set its species member variable
        turtle.species = "Stuffed turtle with a brown shell";
        
        // make a new Donut object
        Donut d = new Donut();
        // set its id and type based on the photo
        d.id = 102;
        d.type = "Powdered";
        
        printSizedDonutStats(d);
        System.out.println("Eating donut...");
        // make sure the turtle takes bites of 50% of a donut
        turtle.setBiteSizeInPercent(50);
        // then go send the donut to the turtle
        turtle.eatDonut(d);
        
        printSizedDonutStats(d);
    } // close main

    public static void printSizedDonutStats(Donut donutToPrint){
        System.out.println("Flavor: " + donutToPrint.type);
        System.out.println("ID: " + donutToPrint.id);
        System.out.println("PercRemaining: " + donutToPrint.getPercRemaining());
    } // close method
} // close class
