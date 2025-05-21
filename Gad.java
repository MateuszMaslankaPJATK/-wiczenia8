public abstract class Gad extends Zwierze {
    protected boolean jadowity;

    public Gad(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public void zmienSkore() {
        System.out.println(nazwa + " zrzuca skórę.");
    }
}
