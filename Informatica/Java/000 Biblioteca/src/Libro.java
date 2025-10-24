public class Libro
{
    private String titolo;
    private String autore;
    private float prezzo;

    public Libro(String titolo, String autore, Float prezzo)
{
    this.titolo = titolo;
    this.autore = autore;
    this.prezzo = prezzo;
}


    public String stampaDettagli()
    {
        return "\nTitolo: " + titolo + "\nAutore: " + autore + "\nPrezzo: " + prezzo + "\n";
    }

    public void sconto(float percentuale)
    {
        prezzo = prezzo - (prezzo * percentuale / 100);
    }


}