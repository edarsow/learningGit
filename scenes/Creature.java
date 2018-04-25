/*
 * Copyright (C) 2018 Technology Rediscovery, LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package scenes;

/**
 * Class to demonstrate Object fundamentals in Java
 * @author Eric Darsow
 */

public class Creature {

    public String name;
    public String species;
    
    private int biteSizeInPercent;
      
    // Method to simulate eating donut
    public void eatDonut(Donut donutToEat){
        donutToEat.simulateEating(biteSizeInPercent);
    }
  
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int size) {
        if(biteSizeInPercent > 0 || biteSizeInPercent < 100){
            this.biteSizeInPercent = size;
        } else {
            System.out.println("Bite size must be between 0 and 100");
        }
    }
    
} // close class