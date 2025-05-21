public abstract class Ssak extends Zwierze {
    protected boolean ssakLadowy;

    public Ssak(String nazwa, int wiek, boolean ssakLadowy) {
        super(nazwa, wiek);
        this.ssakLadowy = ssakLadowy;
    }

    public boolean isSsakLadowy() {
        return ssakLadowy;
    }

    public void karmienieMlekiem() {
        System.out.println(nazwa + " karmi młode mlekiem.");
    }
}
