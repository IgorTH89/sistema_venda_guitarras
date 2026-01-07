import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        // Definindo a guitarra que o cliente procura
        Guitar what_you_like = new Guitar("", "Stratocaster", Builder.FENDER, 
                                          Type.ELETRIC, Wood.ALDER, Wood.ALDER, 0.0);

        List<Guitar> guitarrasAdequadas = inventory.search(what_you_like);

        if (!guitarrasAdequadas.isEmpty()) {
            System.out.println("Talvez você goste destas guitarras:");
            for (Guitar guitar : guitarrasAdequadas) {
                System.out.println("Temos a " + guitar.getBuilder() + " " + 
                    guitar.getModel() + " " + guitar.getType() + " guitar:\n " + 
                    guitar.getBack_wood() + " na traseira e dos lados, \n " + 
                    guitar.getTop_wood() + " no tampo. \nEla pode ser sua por apenas US$" +
                    guitar.getPrice() + "!\n --");
            }
        } else {
            System.out.println("Desculpe, não temos o que você deseja no momento.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.add_guitar("V95693", "Stratocaster", Builder.FENDER, 
                             Type.ELETRIC, Wood.ALDER, Wood.ALDER, 1499.95);
        inventory.add_guitar("V95111", "Stratocaster", Builder.FENDER, 
                             Type.ELETRIC, Wood.ALDER, Wood.ALDER, 1200.00);
        inventory.add_guitar("8276550", "D-28", Builder.MARTIN, 
                             Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 3995.95);
    }
}