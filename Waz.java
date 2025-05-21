public class Waz extends Gad {
    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek, jadowity);
    }

    @Override
    public String wydajDzwiek() {
        return "Ssssss...";
    }

    @Override
    public String poruszajSie() {
        return "Pełza po ziemi.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla i pustynia";
    }
}
