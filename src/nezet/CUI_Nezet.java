package nezet;

import java.util.Scanner;

public class CUI_Nezet {

    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();

    private void konzolraIr(String msg) {
        System.out.print(msg);
    }

    public void leirasMegjelenito(String msg) {
        konzolraIr(msg + SEP);
    }

    public void feladatMegjelenito(String msg) {
        konzolraIr(msg + SEP);
    }
    
    
    public static void eredmeny(boolean valasz) {
        if (valasz) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }
    
      public int valasztas(String msg) {
        konzolraIr(msg);
        return sc.nextInt();
    }

}
