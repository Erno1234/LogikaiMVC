package Model;

public class Lada {

    private String anyag, felirat;
    private boolean kincs;

    public Lada(String anyag, String felirat, boolean kincs) {
        this.felirat = felirat;
        this.anyag = anyag;
        this.kincs = kincs;
    }

    public Lada(String anyag, String felirat) {
        this(anyag, felirat, false);
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public void setFelirat(String felirat) {
        this.felirat = felirat;
    }

}
