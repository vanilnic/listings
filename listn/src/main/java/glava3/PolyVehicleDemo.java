package glava3;

class Vehicle {

}
class Auto2 extends Vehicle {
}
class PolyVehicleDemo {
    public static void main(String[] args) {

        Auto2 a = new Auto2();
        Vehicle v = new Vehicle();
        Vehicle[] pvd = {a, v};

        for (int i = 0; i < pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}
