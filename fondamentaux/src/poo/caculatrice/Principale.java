package poo.caculatrice;
import java.util.Scanner;

import poo.caculatrice.services.CaculatriceService;
import poo.caculatrice.vue.CaculatriceVue;
public class Principale {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        CaculatriceVue caculatriceVue=new CaculatriceVue();
        CaculatriceService caculatriceService=new CaculatriceService(); 
        int choix;
      do {
          int a;   double b;
          choix=caculatriceVue.menu();
         if (choix!=4) {
            a= caculatriceVue.saisieEntier();
            b= caculatriceVue.saisieDouble();
          switch (choix) {
            case 1:
              double result =caculatriceService.addition(a, b);
              caculatriceVue.afficheResutat("La somme est "+result);
                break;
            case 2:
             result =caculatriceService.soustraction(a, b);
             caculatriceVue.afficheResutat("La difference est "+result);
                  break;
            case 3:
                 if (caculatriceService.division(a, b)) {
                    caculatriceVue.afficheResutat("La Difference est "+(a/b));
                 
                  }else{
                    caculatriceVue.afficheResutat("Le denominateur est null");
                 }
                 
                    break;
            default:
                break;
        }
      }
       } while (choix!=4);
   
       scanner.close();

    }
    
    
  }



//Notion de Bloc  ==> {}
//Variables  ont une visibilite de bloc
/*
  {   
     int x;
      {
       int y=2;
        x=12;
          System.out.println(x); 
          System.out.println(y); 
      }
      System.out.println(x);
       System.out.println(y); //Erreur car y n'a pas ete defini dans ce bloc 
  } 
       System.out.println(x); ==> Erreur
 */
