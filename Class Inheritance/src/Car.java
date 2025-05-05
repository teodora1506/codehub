
public class Car extends MotorVehicle {
    private int trunkLoad;
    private int numberOfPassengers;

    public Car(String mark, String model, String color,
               double length, double width, double height, Engine engine,
               int trunkLoad, int numberOfPassengers) {
        super(mark, model, color, length, width, height, engine);
        this.trunkLoad = trunkLoad;
        this.numberOfPassengers = numberOfPassengers;
    }

    // Getters (if needed)
}
