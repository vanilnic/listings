package glava2;

public class GradualCastDEmo {
    public static void main (String[] args) {

        byte x, z;
        int y;

        x = 5;
        y = x * x;

        z = (byte) (x * x);
    }
}
