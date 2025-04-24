import java.util.Date;

public class ToDo extend Bacheca{
    private String titolo_ToDo;
    private String descrizione_ToDo;
    private Date DataScadenza;
    private String URL;
    private int posizione;
    private enum stato;

    public enum stato{
        COMPLETO,
        NON_COMPLETO
    }

    public void ToDo(String titolo, String descrizione, String URL, int posizione, stato stato, Date DataScadenza, String descrizione_ToDo, String titolo_ToDo){
        this.titolo_ToDo = titolo;
        this.descrizione_ToDo = descrizione;
        this.DataScadenza = DataScadenza;
        this.URL = URL;
        this.posizione = posizione;
    }
    public String ToString(){
        return super.toString()+ "/ntitolo: "+ titolo_ToDo+"/ndescrizione: "+ descrizione_ToDo+ "/nData di scadenza: "+DataScadenza+"/nURL: "+ URL+"/nposizione: "+ posizione+"\n";
    }

}
