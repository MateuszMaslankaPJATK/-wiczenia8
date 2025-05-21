public class Lew extends Ssak {
    public Lew(String nazwa, int wiek) {
        super(nazwa, wiek, true);
    }

    @Override
    public String wydajDzwiek() {
        return "Rooaar!";
    }

    @Override
    public String poruszajSie() {
        return "Biega na czterech łapach.";
    }
//
    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna afrykańska";
    }
}
