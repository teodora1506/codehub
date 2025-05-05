public class Main {
    public static void main(String[] args) {
        // Kreiranje motora za auto
        Engine carEngine = new Engine(300, 180, 10, "Turbo-X");

        // Kreiranje automobila sa novim podacima
        Car car = new Car(
                "BMW", "M3", "Red",      // Marku, model i boju
                4.73, 1.88, 1.43,        // Dimenzije: dužina, širina, visina
                carEngine,               // Motor koji koristi
                500,                     // Trunk load u kg
                4                        // Broj putnika
        );

        // Kreiranje motora za kamion
        Engine truckEngine = new Engine(800, 600, 25, "Heavy-Duty");

        // Kreiranje kamiona sa novim podacima
        Truck truck = new Truck(
                "Scania", "R500", "Black",    // Marku, model i boju
                8.5, 2.55, 3.6,              // Dimenzije: dužina, širina, visina
                truckEngine,                 // Motor koji koristi
                35000                        // Maksimalna težina koju kamion može vući u kg
        );

    }
}
