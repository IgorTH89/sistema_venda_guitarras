import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void add_guitar(String serial_number, String model, Builder builder, Type type, Wood back_wood, Wood top_wood, double price) {
        GuitarSpec spec = new  GuitarSpec(builder, model, type, back_wood, top_wood);
        Guitar guitar = new Guitar(serial_number, price, spec);
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

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            
            //Comparação do Builder
            if(searchSpec.getBuilder() != guitarSpec.getBuilder()){
                continue;
            }
            
            // Comparação de Modelo (ignorando maiúsculas/minúsculas e nulos)
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && 
                (!model.equals(guitarSpec.getModel().toLowerCase()))) {
                continue;
            }
            
            // Comparação de Tipo e Madeiras
            if (searchSpec.getType() != guitarSpec.getType()){
                continue;
            }
            if (searchSpec.getBack_wood() != guitarSpec.getBack_wood()){
                continue;
            } 
            if (searchSpec.getTop_wood() != guitarSpec.getTop_wood()){
                continue;
            } 

            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}