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
public class DonutLand {
    final static int FURRY_ANIMAL_BITE_SIZE = 10;
    final static int WATER_ANIMAL_BITE_SIZE = 25;

    public static void main(String[] args){
        // create a donut object
        Donut firstDonut = new Donut();
        // set its name to "chloe"
        firstDonut.name = "Chloe";
        firstDonut.yumminess = 10;
        firstDonut.flavor = "apple";
        
        // check and print out first donut's percent remaining
        System.out.print(firstDonut.name + "'s percent remaining: ");
        System.out.println(firstDonut.getPercentRemaining());
        
        // simulate eating by passing our donut to furry animal eating method
        doFurryAnimalEatsDonut(firstDonut);
        
        // after the eating is over, check the perc remaining
        System.out.print(firstDonut.name + "'s percent remaining: ");
        System.out.println(firstDonut.getPercentRemaining());
        

    }
    
    public static void doFurryAnimalEatsDonut(Donut dToEat){
        if(dToEat.flavor.equals("licorice")){
            // if really yummy, eat normal bite size
            dToEat.simulateEating(FURRY_ANIMAL_BITE_SIZE);
        } else {
            // if not very yummy, eat bite size - 5
            dToEat.simulateEating(FURRY_ANIMAL_BITE_SIZE - 5);
        }
        
        System.out.println("OM NOM NOM!");
    }
    
    public static void doWateryAnimalEatsDonut(Donut dToEat){
        
    }
}
