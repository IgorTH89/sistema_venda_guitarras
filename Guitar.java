public class Guitar {
    //Classe mãe da aplicação do Rick
    private String serial_number, model;
    Builder builder;
    Type type;
    Wood back_wood;
    Wood top_wood;
    private double price;

    public Guitar(String serial_number, String model, Builder builder, Type type, Wood back_wood, Wood top_wood,
            double price) {
        this.serial_number = serial_number;
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.back_wood = back_wood;
        this.top_wood = top_wood;
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBack_wood() {
        return back_wood;
    }

    public void setBack_wood(Wood back_wood) {
        this.back_wood = back_wood;
    }

    public Wood getTop_wood() {
        return top_wood;
    }

    public void setTop_wood(Wood top_wood) {
        this.top_wood = top_wood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
}
