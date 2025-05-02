package views;

import java.time.LocalDate;
import java.util.ArrayList;


import entity.Compte;
import entity.CompteCheque;
import entity.CompteEpargne;
import entity.TypeCompte;
import services.CompteService;

public class CompteView extends View {
       private CompteView(){

       }
      public static  Compte saisieCompte() {
        Compte compte;
        String num;
        do {
             System.out.println("Entrer un numero");
             num=scanner.next();
        } while (CompteService.searchCompteByNum(num)!=null);
       
        double solde =sasieDouble("\"Entrer le solde du compte\"");
        TypeCompte typeCompte=saisieTypeCompte();
        if (typeCompte==TypeCompte.EPARGNE) {
               compte=new CompteEpargne();
               System.out.println("Entrer la Date debut de blocage");
               LocalDate date=LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
               System.out.println("Duree de Blocage en annee");
               int duree=scanner.nextInt();

              ((CompteEpargne) compte).setDateDebutBlocage(date);
              ((CompteEpargne) compte).setDureeBlocage(duree);

         }else{
            compte=new CompteCheque();
        }


        compte.setNumero(num);
        compte.setSolde(solde);

        return compte;

    } 

    public static void afficheCompte(ArrayList<Compte> comptes ){
        for (int index = 0; index < comptes.size(); index++) {
            System.out.println(comptes.get(index).toString());
        }
    }

    public static TypeCompte saisieTypeCompte(){
          int type;
          do {
               System.out.println("1-EPARGNE");
               System.out.println("2-CHEQUE");
               type =scanner.nextInt();
          } while (type!=1 && type!=2);

          return type==1? TypeCompte.EPARGNE:TypeCompte.CHEQUE;
    }
}
