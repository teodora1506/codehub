
public class Truck extends MotorVehicle {
    private int maxPullLoad;

    public Truck(String mark, String model, String color,
                 double length, double width, double height, Engine engine,
                 int maxPullLoad) {
        super(mark, model, color, length, width, height, engine);
        this.maxPullLoad = maxPullLoad;
    }

    // Getters (if needed)
}
