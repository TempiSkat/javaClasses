package javaapplication1;

public class semiPreciousStones extends Diamonds{
    String name;
    double weight;
    double cost;
    boolean transparent;

    public semiPreciousStones(String name, double weight, double cost, boolean transparent) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.transparent = transparent;
    }

    public void setName(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double b) {
        weight =b;
    }

    public double getWeight() {
        return weight;
    }


    public double getPrice() {
        return cost;
    }

    public void setPrice(double c) {
        cost = c;
    }


    public boolean getTransparency() {
        return transparent;
    }

    public void setTransparency(boolean d) {
        transparent = d;
    }
}
