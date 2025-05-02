package views;

import java.util.ArrayList;


import entity.Compte;
import services.CompteService;

public class CompteView extends View {
       private CompteView(){

       }
      public static  Compte saisieCompte() {
        Compte compte =new Compte();
        String num;
        do {
             System.out.println("Entrer un numero");
             num=scanner.next();
        } while (CompteService.searchCompteByNum(num)!=null);
       
        compte.setNumero(num);
        compte.setSolde(sasieDouble("\"Entrer le solde du compte\""));
        return compte;

    } 

    public static void afficheCompte(ArrayList<Compte> comptes ){
        for (int index = 0; index < comptes.size(); index++) {
            System.out.println(comptes.get(index).toString());
        }
    }
}
