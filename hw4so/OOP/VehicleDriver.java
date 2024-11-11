package OOP;

import java.util.Scanner;
public class VehicleDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        String carBrand = scanner.next();
        String carModel = scanner.next();
        int carYear = scanner.nextInt();
        double carPrice = scanner.nextDouble();
        int numberOfDoors = scanner.nextInt();

        Car car = new Car(carBrand, carModel, carYear, carPrice, numberOfDoors);

        // Input for Truck
        String truckBrand = scanner.next();
        String truckModel = scanner.next();
        int truckYear = scanner.nextInt();
        double truckPrice = scanner.nextDouble();
        double loadCapacity = scanner.nextDouble();

        Truck truck = new Truck(truckBrand, truckModel, truckYear, truckPrice, loadCapacity);

        // Input for Motorcycle
        String motorcycleBrand = scanner.next();
        String motorcycleModel = scanner.next();
        int motorcycleYear = scanner.nextInt();
        double motorcyclePrice = scanner.nextDouble();
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleModel, motorcycleYear, motorcyclePrice, hasSidecar);

        // Display details and perform actions
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Depreciation: " + car.calculateDepreciation());
        System.out.println("Cost per Door: " + car.calculateCostPerDoor());
        System.out.println("Total Cost: " + car.calculateTotalCost());

        System.out.println("\nTruck Details:");
        truck.displayDetails();
        System.out.println("Depreciation: " + truck.calculateDepreciation());
        System.out.println("Cost per Ton: " + truck.calculateCostPerTon());
        System.out.println("Total Cost: " + truck.calculateTotalCost());

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();
        System.out.println("Depreciation: " + motorcycle.calculateDepreciation());
        System.out.println("Estimated Insurance Cost: " + motorcycle.estimateInsuranceCost());
        System.out.println("Total Cost: " + motorcycle.calculateTotalCost());
    }
}
class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }

    public double calculateDepreciation() {
        int age = 2024 - year; // Current year is 2024
        double depreciationAmount = price * (1 - Math.pow(0.85, age)); // Depreciation is the difference between original and depreciated value
        return depreciationAmount;
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, double price, int numberOfDoors) {
        super(brand, model, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Number of Doors: " + numberOfDoors);
    }

    public double calculateCostPerDoor() {
        return getPrice() / numberOfDoors;
    }

    public double calculateTotalCost() {
        return calculateDepreciation() + calculateCostPerDoor();
    }
}


class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double price, double loadCapacity) {
        super(brand, model, year, price);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Load Capacity: " + loadCapacity + " tons");
    }

    public double calculateCostPerTon() {
        return getPrice() / loadCapacity;
    }

    public double calculateTotalCost() {
        return calculateDepreciation() + calculateCostPerTon();
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, double price, boolean hasSidecar) {
        super(brand, model, year, price);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand: " + getBrand() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: " + getPrice() + ", Has Sidecar: " + hasSidecar);
    }

    public double estimateInsuranceCost() {
        return hasSidecar ? 700 : 500;
    }

    public double calculateTotalCost() {
        return calculateDepreciation() + estimateInsuranceCost();
    }
}

