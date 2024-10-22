package web.model;

public class Car {
    private String model;
    private int yearOfProduction;
    private String color;

    public Car() {
    }

    public Car(String model, int yearOfProduction, String color) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
