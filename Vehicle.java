package Exercise;

public class Vehicle {
    private double speed;
    private double mileage;

    public Vehicle(double speed, double mileage) {
        this.speed = speed;
        this.mileage = mileage;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(double speed, double mileage, int numberOfSeats) {
        super(speed, mileage);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

class Bike extends Vehicle {
    private String bikeType;

    public Bike(double speed, double mileage, String bikeType) {
        super(speed, mileage);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }
}

