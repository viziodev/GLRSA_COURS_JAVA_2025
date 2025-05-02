import java.util.Scanner;

import entity.Compte;
import entity.Transaction;
import entity.TypeTransaction;
import services.CompteService;
import views.CompteView;
import views.TransactionView;
import views.translate.fr.MenuOption;
import views.translate.fr.MessageTransaction;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MenuOption choix;
       do {
              choix=showMenu();
              switch (choix) {
                case ADD_COMPTE:
                  Compte compte=CompteView.saisieCompte();

                  double montant=compte.getSolde();
                  compte.setSolde(0);
                  CompteService.addCompte(compte);

                  //Instanciation
                  //Transaction transac=new Transaction();
                  //Hydration ==> donnees des valeurs 
                  //transac.setType(TypeTransaction.DEPOT);
                  //transac.setMontant(montant);
                  Transaction transac=Transaction.of(TypeTransaction.DEPOT,montant);
                   //Instanciation +  Hydration 

                  compte.depot(transac);
                break;
                case SHOW_ALL_COMPTE:
                     CompteView.afficheCompte(CompteService.getComptes());
                    break;

                case ADD_TRANSACTION_IN_COMPTE:
                  //1-Rechercher le compte a partir de son numero
                        String num;
                        System.out.println("Entrer le  numero du compte a Recherche");
                        num=scanner.next();
                        compte=CompteService.searchCompteByNum(num);
                        if (compte!=null) {
                            //2-Si le compte existe
                            //Saisie la Transaction
                              Transaction transaction=TransactionView.saisieTransaction();
                           //Ajouter la transaction au compte
                           MessageTransaction result;
                           if (transaction.getType()==TypeTransaction.DEPOT) {
                               result= compte.depot(transaction);
                           } else {
                               result= compte.retrait(transaction);
                           }
                          
                           System.out.println(result.getMessage());
                      }else{
                        System.out.println("Aucun numero correspond a ce compte");
                      }
                 
                break;

                case SHOW_TRANSACTION_IN_COMPTE : 
                    //1-Rechercher le compte a partir de son numero
                    System.out.println("Entrer le  numero du compte a Recherche");
                    num=scanner.next();
                    compte=CompteService.searchCompteByNum(num);
                    if (compte!=null) {
                          TransactionView.afficheTransaction(compte.getTransactions()) ;
                    }else{
                    System.out.println("Aucun numero correspond a ce compte");
                    }

                break;
              
                default:
                     
                    break;
              }
       } while (choix!=MenuOption.QUITTER);
    
    }

    public static  MenuOption showMenu(){
       /* 
         System.out.println(MenuOption.ADD_COMPTE.getMessage());
         System.out.println(MenuOption.SHOW_ALL_COMPTE.getMessage());
         System.out.println(MenuOption.ADD_TRANSACTION_IN_COMPTE.getMessage());
         System.out.println(MenuOption.SHOW_TRANSACTION_IN_COMPTE.getMessage());
         System.out.println(MenuOption.QUITTER.getMessage());
         System.out.println(MenuOption.CHOIX);
        */ 
          MenuOption.showOptionEnum();
          //On saisit un entier
           int choix= scanner.nextInt();
          //Conversion  entier en  MenuOption
          //Retouner un MenuOption
          return MenuOption.getOptionByValue(choix);
    }
}
