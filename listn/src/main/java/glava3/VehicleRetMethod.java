package glava3;

class Vehicle5 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    double distance(double interval) {
        double value = maxspeed * interval;
        return value;
    }
}
class VehicleRetMethod {
public static void main(String[] args) {
    Vehicle5 car = new Vehicle5();
    car.passengers = 2;
    car.wheels = 4;
    car.maxspeed = 130;
    car.burnup = 30;

    Vehicle5 bus = new Vehicle5();
    bus.passengers = 45;
    bus.wheels = 4;
    bus.maxspeed = 100;
    bus.burnup = 25;

    double time = 0.5;
    double distanceCar = car.distance(time);
    double distanceBus = bus.distance(time);

    System.out.print("автомобиль с  " + car.passengers + " пассажирами");
    System.out.println("пройдет за полчаса путь " + distanceCar + " км");
    System.out.print("автобус с  " + bus.passengers + " пассажирами");
    System.out.println("пройдет за полчаса путь " + distanceBus + " км");
}
}