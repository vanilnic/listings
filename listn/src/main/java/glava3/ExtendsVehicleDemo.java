package glava3;

class Vehicle19 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle19() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxSpeed() {
        return this.maxspeed;
    }
}
class auto extends Vehicle19 {
    boolean sunroof;
}
    public class ExtendsVehicleDemo {
        public static void main(String[] args) {
            auto bmw = new auto();
            bmw.sunroof = true;

            System.out.println("Пусть, пройденный за 1.5 часа: " + bmw.distance(1.5) + " км ");
            System.out.println("Max скорость: " + bmw.getMaxSpeed() + " км/ч ");
            System.out.println("Наличие люка: " + bmw.sunroof);
        }
    }
