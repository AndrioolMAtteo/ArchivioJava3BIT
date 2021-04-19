package archiviojava3bit;

/**
 * Classe utilizzata per l'oggetto da contenere nella collezione.
 * Contiene le varibili di istanza, il metodo costruttore, i setter/getter
 * e eventuali altri metodi
 * @author INSERISCI_NOME
 */
public class Cioccolato {
    private String codice;
    
    private String tipologiaCioccolato;
    
    private float prezzoCioccolato;
    
    private String scadenzaCioccolato;
    
    private String formaDelCioccolatino;
    
    private int cioccolatiniNelMagazzino;
    
    public Cioccolato(String codice, String tipolgiaCioccolato, float prezzoCioccolato, String scadenzaCioccolato, String formadelCioccolato, int cioccolatiniNelMagazzino) {
        this.codice = codice;
        this.tipologiaCioccolato = tipologiaCioccolato;
        this.prezzoCioccolato = prezzoCioccolato;
        this.scadenzaCioccolato = scadenzaCioccolato;
        this.formaDelCioccolatino = formaDelCioccolatino;
        this.cioccolatiniNelMagazzino = cioccolatiniNelMagazzino;
    }
    
    public String getcodice() {
    return codice;
  }
  
  public void setcodice(String codice) {
    this.codice = codice;
  }
  
  public String gettipologiaCioccolato() {
    return tipologiaCioccolato;
  }
  
  public void settipologiaCioccolato(String tipologiacioccolato) {
    this.tipologiaCioccolato = tipologiaCioccolato;
  }
  
   public float getprezzoCioccolato() {
    return prezzoCioccolato;
  }
  
  public void setprezzoCioccolato(float prezzocioccolato) {
    this.prezzoCioccolato = prezzoCioccolato;
  }
  
  public String getscadenzaCioccolato() {
    return scadenzaCioccolato;
  }
  
  public void setscadenzaCioccolato(String scadenzacioccolato) {
    this.scadenzaCioccolato = scadenzaCioccolato;
  }
  
  public String getformaDelCioccolatino() {
    return formaDelCioccolatino;
  }
  
  public void setformaDelCioccolato(String formaDelCioccolatino) {
    this.formaDelCioccolatino = formaDelCioccolatino;
  }
  
  public int getcioccolatiniNelMagazzino() {
    return cioccolatiniNelMagazzino;
  }
  
  public void setcioccolatiniNelMagazzino(int cioccolatiniNelMagazzino) {
    this.cioccolatiniNelMagazzino = cioccolatiniNelMagazzino;
  }
  
  
  
    
    
    
 }
