
/**
 * Aggiungi qui una descrizione della classe Piatto
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public final class Piatto 
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String nome;
    private String descrizione;
    private double prezzo;
    private boolean isVegetariano;
    
   /**
     * Costruttore degli oggetti di classe  Piatto
     */
    
    public Piatto(String nome, String descrizione, double prezzo, boolean isVegetariano) 
    {
        // inizializza le variabili d'istanza
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.isVegetariano = isVegetariano;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getDescrizione() 
    {
        return descrizione;
    }

    public double getPrezzo() 
    {
        return prezzo;
    }

    public boolean getIsVegetariano() 
    {
        return isVegetariano;
    }

    public double getPrezzoIvato(int iva) 
    {
        return prezzo + ((prezzo / 100) * iva);
    }

    public String toString() 
    {        
        return "nome del piatto: " + nome + "\n"
            + "prezzo del piatto: " + prezzo + "\n"
            + "descrizione del piatto: " + descrizione + "\n"
            + "il piatto e' vegetariano: " + isVegetariano + "\n";
    }
}

