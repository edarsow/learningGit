/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donutland;

/**
 *
 * @author edarsow
 */
public class Donut {
    
    private int percRemaining = 100;
    public String name;
    // measured on a 1-10 scale, 10 being really yummy
    public int yumminess;
    public String flavor;
    
    public int getPercentRemaining(){
        return percRemaining;
    }
    
    public void simulateEating(int percEaten){
        percRemaining = percRemaining - percEaten;
    }
}
