package com.igorth.guitars.app

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Definindo a guitarra que o cliente procura
        GuitarSpec what_you_like = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
        List matchingGuitars = inventory.search(what_you_like);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Talvez você goste destas guitarras:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                
                System.out.println("Temos a " + spec.getBuilder() + " " + 
                    spec.getModel() + " " + spec.getType() + " guitar:\n " + 
                    spec.getBack_wood() + " na traseira e dos lados, \n " + 
                    spec.getTop_wood() + " no tampo. \nEla pode ser sua por apenas US$" +
                    guitar.getPrice() + "!\n --");
            }
        } else {
            System.out.println("Desculpe, não temos o que você deseja no momento.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.add_guitar("V95693", "Stratocaster", Builder.FENDER, 
                             Type.ELETRIC, Wood.ALDER, Wood.ALDER, 1499.95, 6);
        inventory.add_guitar("V95111", "Stratocaster", Builder.FENDER, 
                             Type.ELETRIC, Wood.ALDER, Wood.ALDER, 1549.95, 6);;
        inventory.add_guitar("8276550", "D-28", Builder.MARTIN, 
                             Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 3995.95, 12);
        inventory.add_guitar("T00123", "Telecaster", Builder.FENDER, 
                            Type.ELETRIC, Wood.MAPLE, Wood.MAPLE, 1100.50, 12);
        inventory.add_guitar("11227", "D-28", Builder.MARTIN, 
                            Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.BRAZILIAN_ROSEWOOD, 3995.95, 12);                             
    }
}
