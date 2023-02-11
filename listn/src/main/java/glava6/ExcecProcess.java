package glava6;

import java.io.IOException;

public class ExcecProcess {
    public static void main(String[] args) {
        try{
           Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
