
/**
 * Aggiungi qui una descrizione della classe TestRistorante
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class TestRistorante 
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private Piatto antipasto1;
    private Piatto primo1;
    private Piatto secondo1;
    private Piatto dessert1;
    
    /**
     * Costruttore degli oggetti di classe  Piatto
     */
    public void main() 
    {
        // --- Test 1: Menu non vegetariano ---
        Piatto antipasto1 = new Piatto("Vitello Tonnato", "Fettine di vitello", 14.00, false);
        Piatto primo1 = new Piatto("Agnolotti del Plin", "Pasta ripiena di carne", 15.00, false);
        Piatto secondo1 = new Piatto("Brasato al Barolo", "Carne di manzo", 22.00, false);
        Piatto dessert1 = new Piatto("Bunet", "Dolce tipico piemontese", 7.00, true);

        Menu menuPiemonte = new Menu("Menu Tradizione Piemontese", antipasto1, primo1, secondo1, dessert1);        
        
        double prezzoTotale = menuPiemonte.calcolaPrezzoTotale();
        System.out.println("Prezzo totale senza sconto: € " + prezzoTotale);
        
        /*double prezzoIvatoAntipasto = antipasto1.getPrezzoIvato(iva);
        double prezzoIvatoPrimo = primo1.getPrezzoIvato(iva);
        double prezzoIvatoSecondo = secondo1.getPrezzoIvato(iva);
        double prezzoIvatoDessert = dessert1.getPrezzoIvato(iva);*/
        
        double scontoPercentuale = 10.0;
        double sconto = prezzoTotale * scontoPercentuale / 100;
        double prezzoScontato = prezzoTotale - sconto;

        System.out.println("Sconto applicato (" + scontoPercentuale + "%): € " + sconto);
        System.out.println("Prezzo totale con sconto: € " + prezzoScontato);

        System.out.println("\n" + menuPiemonte);
        System.out.println("\n---");
    }
}

