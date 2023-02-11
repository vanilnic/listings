package glava3;

class Vehicle15 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;
    Vehicle15() {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    Vehicle15(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
}
