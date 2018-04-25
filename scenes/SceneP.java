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
public class SceneP {
     public static void main(String[] args) {
        // make a creature object
        Creature penguin = new Creature();
        // set its species member variable
        penguin.species = "Penguin with orange beak and yellow collar";
        
        // make a new Donut object
        Donut d = new Donut();
        // set its id for fun (not in photo)
        d.id = 777;
        d.type = "Cinnamon";
        
        printSizedDonutStats(d);
        
        System.out.println("Eating donut...");
        // make sure the turtle takes bites of 50% of a donut
        penguin.setBiteSizeInPercent(20);
        // then go send the donut to the turtle
        penguin.eatDonut(d);
        
        printSizedDonutStats(d);
    } // close main

    public static void printSizedDonutStats(Donut donutToPrint){
        System.out.println("***STATS***");
        System.out.println("Flavor: " + donutToPrint.type);
        System.out.println("ID: " + donutToPrint.id);
        System.out.println("PercRemaining: " + donutToPrint.getPercRemaining());
    } // close method
    
    
}
