package lv.acodemy;

public class Car {

    private String modelName;
    private int fuel;
    private int mileage;
    private int wear;

    public Car(String modelName) {
        this.modelName = modelName;
        this.fuel = 50;
        this.mileage = 0;
        this.wear = 0;
    }

    void drive() {
        if(fuel >= 10 && wear < 90) {
            fuel = fuel - 10;
            mileage = mileage + 50;
            wear = wear + 10;
        } else if (fuel < 10) {
            System.out.println("Not enough fuel!");
        } else {
            System.out.println("Car is very used!");
        }
    }

    public void refuel() {
        if(fuel < 100) {
            fuel = fuel + 30;
            if(fuel > 100) fuel = 100;
            System.out.println(modelName + " is refueled");
        } else {
            System.out.println("Tank is full");
        }
    }

    void service() {
        if(wear > 0) {
            wear = wear - 30;
            if(wear < 0) wear = 0;
            System.out.println(modelName + " got service!");
        } else {
            System.out.println("Car in a good condition!");
        }
    }

    void showStatus() {
        System.out.println("Fuel: " + fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", fuel=" + fuel +
                ", mileage=" + mileage +
                ", wear=" + wear +
                '}';
    }
}
