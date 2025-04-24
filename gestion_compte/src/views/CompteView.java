package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Compte;
import services.CompteService;

public class CompteView {
       private static Scanner scanner=new Scanner(System.in);
       private CompteView(){

       }
      public static  Compte saisieCompte() {
        Compte compte =new Compte();
        String num;
        do {
             System.out.println("Entrer un numero");
             num=scanner.next();
        } while (CompteService.searchCompteByNum(num)!=null);
       
        double solde;
        do {
              System.out.println("Entrer le solde du compte");
              solde=scanner.nextDouble();
        } while (solde<=0);
        compte.setNumero(num);
        compte.setSolde(solde);
        return compte;

    } 

    public static void afficheCompte(ArrayList<Compte> comptes ){
        for (int index = 0; index < comptes.size(); index++) {
            System.out.println(comptes.get(index).toString());
        }
    }
}
