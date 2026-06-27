import java.util.*;

public class Utilisateur {
    private int idUser;
    private String prenom;
    private String nom;
    private List<Livre> listeLivreEmpruntee;


    public Utilisateur( int idUser, String prenom ,String nom,  List<Livre> listeLivreEmpruntee){
        this.idUser = idUser;
        this.prenom  = prenom ;
        this.nom = nom;
        this.listeLivreEmpruntee = listeLivreEmpruntee;
    }

    public int getId(){ return this.idLivre;}
    public String getTitre(){ return this.titre;}
    public String getAuteur(){ return this.auteur;}
    public Boolean Dispo(){ return this.estDispo;}

    
}