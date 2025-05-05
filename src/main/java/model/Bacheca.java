import java.util.ArrayList;

public class Bacheca {
    protected enum titolo;
    protected String descrizione;
    protected static ArrayList<Bacheca> bacheche= new ArrayList<>();

    public enum titolo {
        UNIVERSITA,
        TEMPO_LIBERO,
        LAVORO
    }

    public Bacheca(String titolo, String descrizione) throws Exception{
        for(int i = 0; i < bacheche.size(); i++){
            if(bacheche.get(i).titolo.equals(String titolo ) {
                throw new Exception("Bacheca già presente.");
            }
        }
        this.titolo = titolo;
        this.descrizione = descrizione;
    }
    public String getTitolo() {
        return titolo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public Bacheca CreateBacheca(String titolo, String descrizione) {
        Bacheca NuovaBacheca = new Bacheca(titolo, descrizione);
        bacheche.add(NuovaBacheca);
        System.out.println("Bacheca "+titolo+" creata");
        return NuovaBacheca;
    }
    public void EditBacheca(String titolo) {
        //Metodo per modificare una bacheca
    }
    public void DeleteBacheca(String titolo) {
        //Metodo per eliminare una bacheca
    }
    pUBLIC sTRING

    @Override
    public String toString() {
        return "Bacheca{" + "bacheche=" + bacheche + '}';
    }
}
