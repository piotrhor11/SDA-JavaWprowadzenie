package pl.sda.dzien001;

public class Uczestnik {
    private String imie;
    private boolean obecny;
    private int wiek;

    public Uczestnik(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public boolean obecny() {
        return obecny;
    }

    public void ustawObecnosc() {
        obecny = true;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "imie='" + imie + '\'' +
                ", obecny=" + obecny +
                ", wiek=" + wiek +
                '}';
    }
}
