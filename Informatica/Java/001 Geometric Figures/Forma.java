public class Forma {
    private final String colore;

    public Forma(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public double calcoloArea(){
        return 0.0;
    }

    public String toString(){
        return "Colore: " + colore;
    }

    public String stampaDettagli(){
        return "colore: " + colore;
    }
}
