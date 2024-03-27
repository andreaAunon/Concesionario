package es.babel.model;

public abstract class Pieza {

    private double price;

    public Pieza(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
