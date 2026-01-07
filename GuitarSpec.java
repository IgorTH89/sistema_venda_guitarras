public class GuitarSpec {
    //Especificações da guitarrra
    private Builder builder;
    private String model;
    private Type type;
    private Wood back_wood;
    private Wood top_wood;
    
    //Construtor
    public GuitarSpec(Builder builder, String model, Type type, Wood back_wood, Wood top_wood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.back_wood = back_wood;
        this.top_wood = top_wood;
    }
    
    //Getters e setters
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


    public boolean matches(GuitarSpec otherSpec){
        if(builder != otherSpec.builder){
            return false;
        }
        if((model != null) && (!model.equals("")) && 
        (!model.toLowerCase().equals(otherSpec.model.toLowerCase()))){
            return false;
        }
        if(type != otherSpec.type){
            return false;
        }
        if(back_wood != otherSpec.back_wood){
            return false;
        }
        if(top_wood != otherSpec.top_wood){
            return false;
        }

        return true;
    }
}
