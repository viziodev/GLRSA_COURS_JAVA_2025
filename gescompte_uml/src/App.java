import java.util.Scanner;

import entity.Compte;
import services.CompteService;
import views.CompteView;
import views.MenuOption;
public class App {
      private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CompteView compteView=new CompteView();
        CompteService compteService =new  CompteService();
          MenuOption choix;
       do {
              choix=showMenu();
              switch (choix) {
                  case ADD_COMPTE:
                  Compte compte =compteView.saisieCompte();
                  compteService.addCompte(compte);
                   break;
                  case SHOW_ALL_COMPTE:
                  compteView.afficheCompte(compteService.getComptes());
                  break;
                default: 
                    break;
              }
       } while (choix!=MenuOption.QUITTER);
    }

    public static  MenuOption showMenu(){
       
          System.out.println(MenuOption.ADD_COMPTE.getMessage());
          System.out.println(MenuOption.SHOW_ALL_COMPTE.getMessage());
          System.out.println(MenuOption.ADD_TRANSACTION_IN_COMPTE.getMessage());
          System.out.println(MenuOption.SHOW_TRANSACTION_IN_COMPTE.getMessage());
          System.out.println(MenuOption.QUITTER.getMessage());
          System.out.println(MenuOption.CHOIX);
      
           MenuOption.showOptionEnum();
           //On saisit un entier
            int choix= scanner.nextInt();
           //Conversion  entier en  MenuOption
           //Retouner un MenuOption
           return MenuOption.getOptionByValue(choix);
     }
}
