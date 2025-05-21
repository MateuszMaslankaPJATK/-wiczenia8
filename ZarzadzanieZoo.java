public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 5);
        Zwierze orzel = new Orzel("Bielik", 3, 2.5);
        Zwierze waz = new Waz("Kobra", 2, true);

        Zwierze[] zoo = {lew, orzel, waz};

        for (Zwierze z : zoo) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Porusza się: " + z.poruszajSie());
            System.out.println("Środowisko naturalne: " + z.srodowiskoNaturalne());
            System.out.println("---");
        }

        // Specyficzne zachowania
        ((Ssak)lew).karmienieMlekiem();
        ((Ptak)orzel).lec();
        ((Gad)waz).zmienSkore();
    }
}
