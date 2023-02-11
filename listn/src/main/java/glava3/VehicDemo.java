package glava3;

class Vehicle1 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
class VehicDemo {
    public static void main(String[] args) {
        Vehicle1 car1 = new Vehicle1();
        car1.passengers = 2;
        car1.wheels = 6;
        car1.maxspeed = 130;
        car1.burnup = 30;
        double distance = car1.maxspeed * 0.5;
        System.out.println("за полчаса car1 может проехать");
        System.out.println(distance + "км.");
        car1 = null;
    }
}
