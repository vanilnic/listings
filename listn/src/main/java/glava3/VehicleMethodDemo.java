package glava3;

class Vehicle4 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;

    void distance(double interval) {
        double value = maxspeed * interval;
        System.out.println("пройдёт путь, равный " + value + " км");
    }
}
class VehicleMethodDemo {
    public static void main(String[] args) {
        Vehicle4 car = new Vehicle4();
        car.passengers = 2;
        car.wheels = 4;
        car.maxspeed = 130;
        car.burnup = 30;

        Vehicle4 bus = new Vehicle4();
        bus.passengers = 45;
        bus.wheels = 4;
        bus.maxspeed = 100;
        bus.burnup = 25;

        double time = 0.5;
        System.out.print("автомобиль с  " + car.passengers + " пассажирвми");
        car.distance(time);
        System.out.print("автобус с  " + bus.passengers + " пассажирами");
        bus.distance(time);
    }
}