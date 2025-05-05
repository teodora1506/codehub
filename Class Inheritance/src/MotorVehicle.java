
public abstract class MotorVehicle {
    private String mark;
    private String model;
    private String color;
    private double length;
    private double width;
    private double height;
    private Engine engine;

    public MotorVehicle(String mark, String model, String color,
                        double length, double width, double height, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.engine = engine;
    }

    // Getters (if needed)
}
