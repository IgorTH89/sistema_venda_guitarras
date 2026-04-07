package com.igorth.guitars.model

public class Guitar {
    private String serial_number;
    private double price;
    private GuitarSpec spec;
    
    public Guitar(String serial_number, double price, GuitarSpec spec) {
        this.serial_number = serial_number;
        this.price = price;
        this.spec = spec;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }

    
    
}
