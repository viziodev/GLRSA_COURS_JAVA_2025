package views;
import java.util.ArrayList;
import entity.Compte;


public class CompteView extends View {
    
    public CompteView(){

       }
      public   Compte saisieCompte()  {
        Compte compte =new Compte();
        String num;
        compte.setSolde(sasieDouble("\"Entrer le solde du compte\""));
        return compte;

    } 

    public  void afficheCompte(ArrayList<Compte> comptes ){
        for (int index = 0; index < comptes.size(); index++) {
            System.out.println(comptes.get(index).toString());
        }
    }
}
