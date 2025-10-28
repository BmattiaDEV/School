
/**
 * Aggiungi qui una descrizione della classe Menu
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Menu 
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String nomeMenu;
    private Piatto antipasto;
    private Piatto primo;
    private Piatto secondo;
    private Piatto dessert;
    private boolean menuVegetariano;
    
    /**
     * Costruttore degli oggetti di classe  Menu
     */
    
    public Menu(String nomeMenu, Piatto antipasto, Piatto primo, Piatto secondo, Piatto dessert) 
    {
        // inizializza le variabili d'istanza
        this.nomeMenu = nomeMenu;
        this.antipasto = antipasto;
        this.primo = primo;
        this.secondo = secondo;
        this.dessert = dessert;
    }

    public String getNomeMenu() 
    {
        return nomeMenu;
    }

    public Piatto getAntipasto() 
    {
        return antipasto;
    }

    public Piatto getPrimo() 
    {
        return primo;
    }

    public Piatto getSecondo() 
    {
        return secondo;
    }

    public Piatto getDessert() 
    {
        return dessert;
    }

    public double calcolaPrezzoTotale() 
    {
        return antipasto.getPrezzo() + primo.getPrezzo() + secondo.getPrezzo() + dessert.getPrezzo();
    }

    public double calcolaPrezzoScontato(double percentualeSconto) 
    {
        double totale = calcolaPrezzoTotale();
        return totale - ((totale / 100) * percentualeSconto);
    }

    public boolean isMenuVegetariano()
    {
        if(antipasto.getIsVegetariano() &&
            primo.getIsVegetariano() &&
            secondo.getIsVegetariano() &&
            dessert.getIsVegetariano())
            {
                menuVegetariano = true;
                return menuVegetariano;
            }
        else
        {
            menuVegetariano = false;
            return menuVegetariano;
        }
        
    }

    public String toString() 
    {
        return nomeMenu + ":\n"
            + "Antipasto: " + antipasto + "\n"
            + "Primo: " + primo + "\n"
            + "Secondo: " + secondo + "\n"
            + "Dessert: " + dessert + "\n"
            + "Prezzo Totale: € " + calcolaPrezzoTotale() + "\n";
            //+ "Prezzo scontato: € " + calcolaPrezzoScontato() + "\n"; 
    }
}
