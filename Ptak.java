public abstract class Ptak extends Zwierze {
    protected double rozpietoscSkrzydel;

    public Ptak(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public void lec() {
        System.out.println(nazwa + " leci.");
    }
}
