package glava3;

interface A {
    void metodA();
}
interface B extends A {
    void metodB();
}
class IExample implements B {
    public void metodA() {System.out.println("Метод A");}
    public void metodB() {System.out.println("Метод B");}
}
class IExampleDemo {
    public static void main(String[] args) {
        IExample ie = new IExample();
        ie.metodA();
        ie.metodB();
    }
}
