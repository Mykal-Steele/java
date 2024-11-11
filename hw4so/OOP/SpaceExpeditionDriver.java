import java.util.Scanner;
public class SpaceExpeditionDriver {
    public static void main(String[] args) {
        // Create instances of different spacecraft
        CargoShip cargoShip = new CargoShip();
        ResearchVessel researchVessel = new ResearchVessel();
        PassengerShuttle passengerShuttle = new PassengerShuttle();
        MiningDrone miningDrone = new MiningDrone();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the distance each spacecraft will travel
        double cargoShipDistance = scanner.nextDouble();
        double researchVesselDistance = scanner.nextDouble();
        double passengerShuttleDistance = scanner.nextDouble();
        double miningDroneDistance = scanner.nextDouble();
        
        // CargoShip fuel management
        cargoShip.consumeResource(cargoShip.estimateConsumptionForDistance(cargoShipDistance));
        System.out.println("CargoShip fuel remaining after traveling " + cargoShipDistance + " units: " + cargoShip.calculateRemainingResource() + " units");

        // ResearchVessel food management
        researchVessel.consumeResource(researchVessel.estimateConsumptionForDistance(researchVesselDistance));
        System.out.println("ResearchVessel food supply remaining after traveling " + researchVesselDistance + " units: " + researchVessel.calculateRemainingResource() + " units");

        // PassengerShuttle oxygen management
        passengerShuttle.consumeResource(passengerShuttle.estimateConsumptionForDistance(passengerShuttleDistance));
        System.out.println("PassengerShuttle oxygen supply remaining after traveling " + passengerShuttleDistance + " units: " + passengerShuttle.calculateRemainingResource() + " units");

        // MiningDrone energy management
        miningDrone.consumeResource(miningDrone.estimateConsumptionForDistance(miningDroneDistance));
        System.out.println("MiningDrone energy remaining after traveling " + miningDroneDistance + " units: " + miningDrone.calculateRemainingResource() + " units");
    }
}

interface ResourceManagement {
    double FUEL_CONSUMPTION_RATE = 0.5;
    double FOOD_CONSUMPTION_RATE = 0.2;
    double OXYGEN_CONSUMPTION_RATE = 0.3;
    double ENERGY_CONSUMPTION_RATE = 0.4;

    void addResource(double amount);
    void consumeResource(double amount);
    double calculateRemainingResource();
    double estimateConsumptionForDistance(double distance);
}

abstract class Spacecraft implements ResourceManagement {
    protected double resource;

    public abstract double calculateRemainingResource();
    public abstract double estimateConsumptionForDistance(double distance);

    public void addResource(double amount) {
        resource += amount;
    }

    public void consumeResource(double amount) {
        resource -= amount;
    }
}

class CargoShip extends Spacecraft {
    public CargoShip() {
        this.resource = 1000;
    }

    @Override
    public double calculateRemainingResource() {
        return this.resource;
    }

    @Override
    public double estimateConsumptionForDistance(double distance) {
        return distance * FUEL_CONSUMPTION_RATE;
    }
}

class ResearchVessel extends Spacecraft {
    public ResearchVessel() {
        this.resource = 500;
    }

    @Override
    public double calculateRemainingResource() {
        return this.resource;
    }

    @Override
    public double estimateConsumptionForDistance(double distance) {
        return distance * FOOD_CONSUMPTION_RATE;
    }
}

class PassengerShuttle extends Spacecraft {
    public PassengerShuttle() {
        this.resource = 800;
    }

    @Override
    public double calculateRemainingResource() {
        return this.resource;
    }

    @Override
    public double estimateConsumptionForDistance(double distance) {
        return distance * OXYGEN_CONSUMPTION_RATE;
    }
}

class MiningDrone extends Spacecraft {
    public MiningDrone() {
        this.resource = 600;
    }

    @Override
    public double calculateRemainingResource() {
        return this.resource;
    }

    @Override
    public double estimateConsumptionForDistance(double distance) {
        return distance * ENERGY_CONSUMPTION_RATE;
    }
}
