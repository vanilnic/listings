package glava3;

class Vehicle9 {
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
    Vehicle9(int passengers, int wheels, int maxspeed, int burnup){
        this.passengers = passengers;
        this.wheels = wheels;
        this.maxspeed = maxspeed;
        this.burnup = burnup;
    }
double distance(double interval) {
        double value = this.maxspeed * interval;
        return value;
}
}
