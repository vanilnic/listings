package glava3;
class Vehicle2 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
class MoreVehiclesDemo {
    public static void main(String[] args) {
        Vehicle2 car1 = new Vehicle2();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;

        Vehicle2 bus1 = new Vehicle2();
        bus1. passengers = 25;
        bus1.wheels = 4;
        bus1.maxspeed = 100;
        bus1.burnup = 25;

        double interval = 1.25;
        double distanceCar = car1.maxspeed * interval;
        double distanceBus = bus1.maxspeed * interval;

        System.out.print("car1 может проезать за 1 час 15 мин расстояние в ");
        System.out.print(distanceCar + "кс м" + bus1.passengers);
        System.out.println("пассажирами");
        System.out.print("bus1 может проехать за 1 час 15 мин расстояние в ");
        System.out.print(distanceBus + "км с" + bus1.passengers);
        System.out.println("пассажирами");
    }
}
