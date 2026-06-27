import java.util.*;

public class Bibliotheque {
    private List<Livre> listeLivres;
    private List<Utilisateur> listeUtilisateurs;

    public Bibliotheque(List<Livre> listeLivres , List<Utilisateur> listeUtilisateurs){
        this.listeLivres = listeLivres;
        this.listeUtilisateurs = listeUtilisateurs;
    }

    public void afficherLivres(){
        for(Livre l : this.listeLivres){
            System.out.print(l);
        }
    }

    public void afficherUtilisateurs(){
        for(Utilisateur u : this.listeUtilisateurs){
            System.out.print(u);
        }
    }

}
