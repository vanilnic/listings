package glava3;

class Vehicle8 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    Vehicle8(int p, int w, int ms, int bu) {
        passengers = p;
        wheels = w;
        maxspeed = ms;
        burnup = bu;
    }
    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
public class VehicleConstrDemo {
    public static void main (String[] args) {
        Vehicle8 car = new Vehicle8(2, 4, 130, 30);
        Vehicle8 bus = new Vehicle8(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("Автомобиль с " + car.passengers + " пассажирами" + " проедет за 1 час " + distanceCar + " км ");
        System.out.println("Автобус с " + bus.passengers + " пассажирами" + " проедет за 1 час " + distanceBus + " км ");
    }

}

