package glava3;

public class StaticBlock {
    static double rootOf9;
    static double rootOf27;
    int number;
    static {
        System.out.println("Инициализвция статических членов класса . . .");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }
    StaticBlock(int number) {
        System.out.println("Инициализация переменных экземпляра класса . . .");
        this.number = number;
    }
}
class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Корень из 9 равен " + StaticBlock.rootOf9);
        System.out.println("Корень из 27 равен " + StaticBlock.rootOf27);
        StaticBlock sb1 = new StaticBlock(4);
        System.out.println("sb1.number = " + sb1.number);

        StaticBlock sb2 = new StaticBlock(16);
        System.out.println("sb2.number = " + sb2.number);

    }
}
