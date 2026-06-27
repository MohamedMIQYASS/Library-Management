import javax.swing.text.html.HTMLDocument.BlockElement;

public class Livre {
    private int idLivre;
    private String titre;
    private String auteur;
    private Boolean estDispo;


    public Livre( int idLivre , String titre ,String auteur ,  Boolean estDispo ){
        this.idLivre = idLivre;
        this.titre = titre;
        this.auteur = auteur;
        this.estDispo = estDispo;
    }

    public int getId(){ return this.idLivre;}
    public String getTitre(){ return this.titre;}
    public String getAuteur(){ return this.auteur;}
    public Boolean Dispo(){ return this.estDispo;}

    
}