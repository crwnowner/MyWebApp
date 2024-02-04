package model;

public class Car {
    private int horsepower;
    private String model;
    private int cost;
    public Car(int horsepower, String model, int cost) {
        this.horsepower = horsepower;
        this.model = model;
        this.cost = cost;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
