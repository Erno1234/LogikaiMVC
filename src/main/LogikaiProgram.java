package main;

import Model.Lada;
import nezet.CUI_Nezet;

public class LogikaiProgram {

    private static CUI_Nezet cv = new CUI_Nezet();
    private static Lada[] ladak;

    public static void main(String[] args) {
        cv.feladatMegjelenito("Minden láda 1-1 állítást tartalmaz, csak az egyik igaz. Melyikben van kincs?");
        ladak = new Lada[3];
        ladak[0] = new Lada("én rejtem a kincset!", " Arany láda: ", false);
        ladak[1] = new Lada("nem én rejtem a kincset!", " Ezüst láda: ", true);
        ladak[2] = new Lada("az arany hazudik ", " Bronz láda: ", false);

        for (Lada lada : ladak) {
            cv.leirasMegjelenito(lada.getAnyag());
            cv.leirasMegjelenito(lada.getFelirat());
        }
        eredemeny();
        }
    

    private static void eredemeny() {
        int valasz = cv.valasztas();
        boolean helyesE = (valasz == 2);
        cv.eredmeny(helyesE);
    }
}
