import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void add_guitar(String serial_number, String model, Builder builder, Type type, Wood back_wood, Wood top_wood, double price) {
        Guitar guitar = new Guitar(serial_number, model, builder, type, back_wood, top_wood, price);
        guitars.add(guitar);
    }

    public Guitar getguitar(String serial_number) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerial_number().equals(serial_number)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(Guitar searchGuitar) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();

        for (Guitar guitar : guitars) {
            // Comparação de Modelo (ignorando maiúsculas/minúsculas e nulos)
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.isEmpty()) && 
                (!model.toLowerCase().equals(guitar.getModel().toLowerCase()))) {
                continue;
            }
            
            // Comparação de Builder
            if (searchGuitar.getBuilder() != guitar.getBuilder()) continue;

            // Comparação de Tipo e Madeiras
            if (searchGuitar.getType() != guitar.getType()){
                continue;
            }
            if (searchGuitar.getBack_wood() != guitar.getBack_wood()){
                continue;
            } 
            if (searchGuitar.getTop_wood() != guitar.getTop_wood()){
                continue;
            } 

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}