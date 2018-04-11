public class Fahrzeug{
    private int anzahlräder;
    private String Typ;
    private String Farbe;
    private int richtung;
    public Fahrzeug(int anzahlräder,String Typ){
        this.anzahlräder = anzahlräder;
        this.Typ = Typ;
    }
    public int getAnzahlräder(){
        return anzahlräder;
    }
    public String getTyp(){
        return Typ;
    }
    public void setFarbe(String Farbe){
        this.Farbe = Farbe;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setAnzahlräder(int anzahlräder) {
        this.anzahlräder = anzahlräder;
    }
}