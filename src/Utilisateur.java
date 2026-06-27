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

    public int getIdUser(){ return this.idUser;}
    public String getPrenom(){ return this.prenom;}
    public String getNom(){ return this.nom;}

    public void afficherLivreEmpruntee(listeLivreEmpruntee){
        for(Livre l : listeLivreEmpruntee){
            system.out.print(l);
        }
    }


    
}