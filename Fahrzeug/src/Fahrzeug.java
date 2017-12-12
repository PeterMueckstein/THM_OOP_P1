public abstract class Fahrzeug {
    private int anzahlräder = 0;
    private int gewicht = 0;

    public int getAnzahlräder() {
        return anzahlräder;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setAnzahlräder(int anzahlräder) {
        this.anzahlräder = anzahlräder;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
    public abstract void strecke();
}
