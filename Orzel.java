public class Orzel extends Ptak {
    public Orzel(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek, rozpietoscSkrzydel);
    }

    @Override
    public String wydajDzwiek() {
        return "Kiiiiii!";
    }

    @Override
    public String poruszajSie() {
        return "Lata w przestworzach.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i wysokie klify";
    }
}
