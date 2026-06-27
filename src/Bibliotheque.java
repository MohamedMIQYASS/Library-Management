import java.util.*;

public class Bibliotheque {
    private List<Livre> listeLivres;
    private List<Utilisateur> listeUtilisateurs;

    public Bibliotheque(List<Livre> listeLivres , List<Utilisateur> listeUtilisateurs){
        this.listeLivres = listeLivres;
        this.listeUtilisateurs = listeUtilisateurs;
    }

    public void afficherLivres(listeLivres){
        for(Livre l : listeLivres){
            system.out.print(l);
        }
    }

    public void afficherUtilisateurs(listeUtilisateurs){
        for(Utilisateur u : listeUtilisateurs){
            system.out.print(u);
        }
    }





    
}
