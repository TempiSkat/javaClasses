package javaapplication1;

public class Gems extends Diamonds{
    String name;
    double weight;
    double cost;
    boolean transparency;

    public Gems(String name, double weight, double cost, boolean transparency) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.transparency = transparency;
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
        return transparency;
    }

    public void setTransparency(boolean d) {
        transparency = d;
    }
}
