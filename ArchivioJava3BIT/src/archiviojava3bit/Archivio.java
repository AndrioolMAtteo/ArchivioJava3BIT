package archiviojava3bit;
import java.util.ArrayList;

/**
 * Contiene gli oggetti del programma.
 * Implementata tramite un ArrayList.
 * Ci permette di inserire gli oggetti,
 * effettuare ricerche e
 * aggiungere/rimuovere/modificare un oggetto.
 * @author INSERISCI_NOME
 */
public class Archivio {
    private ArrayList<Cioccolato> archivio;
    
    // Costruttore 
    public Archivio() {
        // creo l'array list vuoto
        archivio = new ArrayList(0);
    }
    
    // metodo per inserire un Cioccolato
    public void inserisci(Cioccolato cioccolato) {
        // aggiungo l'oggetto ricevuto nell'ArrayList
        archivio.add(cioccolato);
    }
    
    //Metodo per ricerca in base al codice 
    public Cioccolato ricerca(String codice) {
        for(int i=0; i<archivio.size();i++) {
            // prendiamo l'oggetto in posizione i
            Cioccolato cioccolato = archivio.get(i);
            if(cioccolato.getcodice()==codice) {
                return cioccolato;
            }
        }
        // se arrivo qui significa che il cioccolato non c'è.
        return null;
    }
    
}
